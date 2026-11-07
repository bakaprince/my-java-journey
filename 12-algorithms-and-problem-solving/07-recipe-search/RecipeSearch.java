
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.System;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File to read: ");
        String fileName=scanner.nextLine();
        
        ArrayList<Recipe> recipes = readRecipes(fileName);
        
        System.out.println("Commands:\n" +"list - lists the recipes\n" +"stop - stops the program\n"+"find name - searches recipes by name\n"+"find cooking time - searches recipes by cooking time\\n"+"find ingredient - searches recipes by ingredient");
        while(true){
            System.out.println("Enter command: ");
            String command=scanner.nextLine();
            
            if(command.equals("stop")){
                break; 
            }else if(command.equals("list")){
                System.out.println("Recipes:");
                
                for(Recipe recipe:recipes){
                    System.out.println(recipe.toString());
                } 
            }else if(command.equals("find name")){
                System.out.println("Searched word: ");
                String input=scanner.nextLine();
                for(Recipe recipe:recipes){
                    if(recipe.getName().contains(input)){
                        System.out.println(recipe);
                    }
                }
            }else if(command.equals("find cooking time")){
                System.out.println("Max cooking time: ");
                int input=Integer.valueOf(scanner.nextLine());
                
                for(Recipe recipe:recipes){
                    if(recipe.getCookingTime()<=input){
                        System.out.println(recipe);
                    }
                }
            }else if(command.equals("find ingredient")){
                System.out.println("Ingredient: ");
                String name=scanner.nextLine();
                for(Recipe recipe:recipes){
                    if(recipe.getIngredients().contains(name)){
                        System.out.println(recipe);
                    }
                }
            }
        }
    }
    public static ArrayList<Recipe> readRecipes(String fileName){
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        try(Scanner reader = new Scanner(Paths.get(fileName))){
            while(reader.hasNextLine()){
                String name=reader.nextLine();
                if(name.isEmpty()){
                    continue;
                }
                int cookingTime=Integer.valueOf(reader.nextLine());
                
                Recipe recipe = new Recipe(name, cookingTime);
                
                while(reader.hasNextLine()){
                    String ingredient=reader.nextLine();
                    
                    if(ingredient.isEmpty()){
                        break;
                    }
                    recipe.addIngredients(ingredient);
                }
                
                recipes.add(recipe);
                
            }
        }catch(Exception e){
           System.out.println("Error: "+ e.getMessage());     
        }
        
        return recipes;
    }
    
}
