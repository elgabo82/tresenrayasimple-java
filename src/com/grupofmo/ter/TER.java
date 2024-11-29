package com.grupofmo.ter;
/*
 * Juego: Tres En Raya
 * Gabriel Morejón López
 * 28.11.2024 20.30
 */


import java.util.Scanner;

public class TER {
	private final static int FILAS = 3;
	private final static int COLS = 3;
	private char tablero[][];
	
	public TER() {
		tablero = new char[FILAS][COLS];
		menu();
	}
	
	public void menu() {
		int opcion=-1;
		
		Scanner ingreso = new Scanner(System.in);
		
		while (opcion != 4) {
			System.out.println("\t\t*************************");			
			System.out.println("\t\t* JUEGO DE TRES EN RAYA *\t\t");
			System.out.println("\t\t*************************");
			System.out.println("1. Jugar.");
			System.out.println("2. Instrucciones.");
			System.out.println("3. Acerca de.");
			System.out.println("4. Salir.");			
			System.out.print("Escoja una opción: ");
			opcion = ingreso.nextInt();
			
			switch (opcion) {
			case 1: {
				jugarTER();
				break;
			}
			case 2: {
				instrucciones();
				//sleep(2);
				break;
			}
			case 3: {
				acercaDe();
				//sleep(2);
				break;
			}
			case 4: {				
				System.out.println("\nAdiós...\n");
				//sleep(1);
				break;
			}

			default:
				System.out.println("Opción incorrecta.");
				break;
			}			
		}
	}

	private void acercaDe() {
		System.out.println("Juego de Tres En Raya");
		System.out.println("Fundamentos de Programación");
		System.out.println("Profesor: Gabriel Morejón López");
		System.out.println("Semestre: 2024-S2");
		System.out.println("Regresando al menú anterior en breve...");		
	}

	private void instrucciones() {
		System.out.println("Instrucciones:");
		System.out.println("JUGADOR (Humano): X");		
		System.out.println("OPONENTE (Computadora): O");
		System.out.println("Regresando al menú anterior en breve...");		
	}

	private void jugarTER() {
		// TODO Auto-generated method stub
		
	}
}
