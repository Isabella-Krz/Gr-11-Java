/*
Student: Isabella K

Teacher: Carrario

Period: 2

Description: This code calculates the left over volume of a cube that holds a sphere using the diameter of the length of the cube given by the user's input.
*/

import java.util.Scanner;

public class SphereInCubeIsabellaKrzepton {
    public static void main(String[] args) {
        // Variable declaration and initialization

        Scanner userInput = new Scanner (System.in); // Initialize the scanner

        // Volumes
        double volumeOfSphere = 0.0;
        double volumeOfCube = 0.0;
        double finalVolume = 0.0;

        // Measurements
        double cubeLength = 0.0;

        // User input

        System.out.print("Please enter the length of one side of the cube: ");
        cubeLength = userInput.nextDouble(); // Aks the user for the length of the cube, which is also the diameter of the sphere

        // Program execution

        volumeOfSphere = (4.0/3.0) * Math.PI * Math.pow(cubeLength / 2.0, 3); // Formula for the volume of a sphere

        volumeOfCube = Math.pow(cubeLength, 3); // Formula for the volume of a cube

        finalVolume = volumeOfCube - volumeOfSphere; // Formula for the final volume of the cube with the displaced sphere

        // Program output

        System.out.printf("The volume of a sphere with a diameter of %.2f is %.2f^3 %n", cubeLength, volumeOfSphere); // Displays the volume of the sphere

        System.out.printf("The volume of a cube with a side length of %.2f is %.2f^3 %n", cubeLength, volumeOfCube); // Displays the volume of the cube

        System.out.printf("The volume of a cube minus the displaced volume of a sphere is %.2f^3", finalVolume); // Displays the final volume of the cube with the displaced sphere
    }
}
