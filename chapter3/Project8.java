package chapter3;

/*
	This program will filter out profane words in a sentence.
	For reasons of this project, cat,dog, and llama will be used
	as profane words.
	Author: Josias JJ Oberholster.
	Chapter 3 project 8.
	Last Changed 19 April 2017.
 */

import javax.swing.JOptionPane;

public class Project8 extends JOptionPane{

	public static void main(String[] args){
		
		int startProgram = JOptionPane.showConfirmDialog(null, "This program will filter out profane words in a sentence."
														+ "\nFor reasons of this project, cat,dog, and llama will be used"
														+ "\nas profane words."
														+ "\n\nProceed?", "Profane Filter", JOptionPane.YES_NO_OPTION);
		
		if(startProgram == YES_OPTION){
			
			
			String words = JOptionPane.showInputDialog("Enter a whole sentence that contains either cat, dog, llama or neither:");
			
			boolean cat = false, dog = false , llama = false;
			String sentence = words.toLowerCase();
			
			if(sentence.contains("cat")){
				cat = true;
			}
			
			if(sentence.contains("dog")){
				dog = true;
			}

			if(sentence.contains("llama")){
				llama = true;
			}else{
				JOptionPane.showMessageDialog(null, "The sentence does not contain a profane word");
			}
			
			if(cat == true || dog == true || llama == true){
				
				if(cat == true){
					if(cat == true && dog == true && llama == true){
						JOptionPane.showMessageDialog(null, "The sentence contains the following profane words:"
													 + "\nCat"
													 + "\nDog"
													 + "\nLlama");
						System.exit(0);
					}else if(cat == true && dog == true){
						JOptionPane.showMessageDialog(null, "The sentence contains the following profane words:"
													 + "\nCat"
													 + "\nDog");
						System.exit(0);
					}else if(cat == true && llama == true){
						JOptionPane.showMessageDialog(null, "The sentence contains the following profane words:"
													 + "\nCat"
													 + "\nLlama");
						System.exit(0);
					}else{
						JOptionPane.showMessageDialog(null, "The sentence contains the following profane words:"
								 					+ "\nCat");
						System.exit(0);
					}
				}
				
				if(dog == true){
					if(dog == true && llama == true){
						JOptionPane.showMessageDialog(null, "The sentence contains the following profane words:"
													 + "\nDog"
													 + "\nLlama");
						System.exit(0);
					}else{
						JOptionPane.showMessageDialog(null, "The sentence contains the following profane words:"
								 					+ "\nDog");
						System.exit(0);
					}
				}
				
				if(llama == true){
					JOptionPane.showMessageDialog(null, "The sentence contains the following profane words:"
							 						+ "\nLlama");
					System.exit(0);
				}	
			}
			
		}else if(startProgram == NO_OPTION){
			System.exit(0);
		}else{
			System.out.println("Program was force closed.");
			System.exit(0);
		}
		System.exit(0);
	}
}
