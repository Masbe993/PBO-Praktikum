/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

public class lyrik {
	private String[] lyrics;
	
	public lyrik() {
        this.lyrics = new String[]{
                "There was a farmer who had a dog,",
                "And Bingo was his name-o.",
                "B-I-N-G-O",
                "B-I-N-G-O",
                "B-I-N-G-O",
                "And Bingo was his name-o.",
                "There was a farmer who had a dog,",
                "And Bingo was his name-o.",
                "(clap)-I-N-G-O",
                "(clap)-I-N-G-O",
                "(clap)-I-N-G-O",
                "And Bingo was his name-o.",
                "There was a farmer who had a dog,",
                "And Bingo was his name-o.",
                "(clap)-(clap)-N-G-O",
                "(clap)-(clap)-N-G-O",
                "(clap)-(clap)-N-G-O",
                "And Bingo was his name-o.",
                "There was a farmer who had a dog,",
                "And Bingo was his name-o.",
                "(clap)-(clap)-(clap)-G-O",
                "(clap)-(clap)-(clap)-G-O",
                "(clap)-(clap)-(clap)-G-O",
                "And Bingo was his name-o.",
                "There was a farmer who had a dog,",
                "And Bingo was his name-o.",
                "(clap)-(clap)-(clap)-(clap)-O",
                "(clap)-(clap)-(clap)-(clap)-O",
                "(clap)-(clap)-(clap)-(clap)-O",
                "And Bingo was his name-o.",
                "There was a farmer who had a dog,",
                "And Bingo was his name-o.",
                "(clap)-(clap)-(clap)-(clap)-(clap)",
                "(clap)-(clap)-(clap)-(clap)-(clap)",
                "(clap)-(clap)-(clap)-(clap)-(clap)",
                "And Bingo was his name-o."

        };
    }

	public void sing() {
        for (String line : lyrics) {
            System.out.println(line);
        }
    }
}
