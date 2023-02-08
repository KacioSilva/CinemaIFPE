package Core;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Database.Conexao;
import Database.SelectPoltronas;

public class ControlePoltrona {
  
   private static int preco;
   
   private static ArrayList<String> arrayPoltronasSelecionadas = new ArrayList<String>();
  
   
   private static String PoltronaLivreS1;
   private static String PoltronaLivreS2;
   private static String PoltronaLivreS3;
   private static String PoltronaLivreS4;
   private static String PoltronaLivreS5;
   private static String PoltronaLivreS6;
  
   private static String PoltronaLivreS1A2;
   private static String PoltronaLivreS2A2;
   private static String PoltronaLivreS3A2;
   private static String PoltronaLivreS4A2;
   private static String PoltronaLivreS5A2;
   private static String PoltronaLivreS6A2;
   
   private static String PoltronaLivreS1A3;
   private static String PoltronaLivreS2A3;
   private static String PoltronaLivreS3A3;
   private static String PoltronaLivreS4A3;
   private static String PoltronaLivreS5A3;
   private static String PoltronaLivreS6A3;
   
   private static String PoltronaLivreS1A4;
   private static String PoltronaLivreS2A4;
   private static String PoltronaLivreS3A4;
   private static String PoltronaLivreS4A4;
   private static String PoltronaLivreS5A4;
   private static String PoltronaLivreS6A4;
   
   private static String PoltronaLivreS1A5;
   private static String PoltronaLivreS2A5;
   private static String PoltronaLivreS3A5;
   private static String PoltronaLivreS4A5;
   private static String PoltronaLivreS5A5;
   private static String PoltronaLivreS6A5;
    
   private static String PoltronaLivreS1B1;
   private static String PoltronaLivreS2B1;
   private static String PoltronaLivreS3B1;
   private static String PoltronaLivreS4B1;
   private static String PoltronaLivreS5B1;
   private static String PoltronaLivreS6B1;
   
   private static String PoltronaLivreS1B2;
   private static String PoltronaLivreS2B2;
   private static String PoltronaLivreS3B2;
   private static String PoltronaLivreS4B2;
   private static String PoltronaLivreS5B2;
   private static String PoltronaLivreS6B2;

   private static String PoltronaLivreS1B3;
   private static String PoltronaLivreS2B3;
   private static String PoltronaLivreS3B3;
   private static String PoltronaLivreS4B3;
   private static String PoltronaLivreS5B3;
   private static String PoltronaLivreS6B3;
   
   private static String PoltronaLivreS1B4;
   private static String PoltronaLivreS2B4;
   private static String PoltronaLivreS3B4;
   private static String PoltronaLivreS4B4;
   private static String PoltronaLivreS5B4;
   private static String PoltronaLivreS6B4;
   
   private static String PoltronaLivreS1B5;
   private static String PoltronaLivreS2B5;
   private static String PoltronaLivreS3B5;
   private static String PoltronaLivreS4B5;
   private static String PoltronaLivreS5B5;
   private static String PoltronaLivreS6B5;
   
   private static String PoltronaLivreS1C1;
   private static String PoltronaLivreS2C1;
   private static String PoltronaLivreS3C1;
   private static String PoltronaLivreS4C1;
   private static String PoltronaLivreS5C1;
   private static String PoltronaLivreS6C1;
   
   private static String PoltronaLivreS1C2;
   private static String PoltronaLivreS2C2;
   private static String PoltronaLivreS3C2;
   private static String PoltronaLivreS4C2;
   private static String PoltronaLivreS5C2;
   private static String PoltronaLivreS6C2;
   
   private static String PoltronaLivreS1C3;
   private static String PoltronaLivreS2C3;
   private static String PoltronaLivreS3C3;
   private static String PoltronaLivreS4C3;
   private static String PoltronaLivreS5C3;
   private static String PoltronaLivreS6C3;
   
   private static String PoltronaLivreS1C4;
   private static String PoltronaLivreS2C4;
   private static String PoltronaLivreS3C4;
   private static String PoltronaLivreS4C4;
   private static String PoltronaLivreS5C4;
   private static String PoltronaLivreS6C4;
   
   private static String PoltronaLivreS1C5;
   private static String PoltronaLivreS2C5;
   private static String PoltronaLivreS3C5;
   private static String PoltronaLivreS4C5;
   private static String PoltronaLivreS5C5;
   private static String PoltronaLivreS6C5;
   

   private static String PoltronaLivreS1D1;
   private static String PoltronaLivreS2D1;
   private static String PoltronaLivreS3D1;
   private static String PoltronaLivreS4D1;
   private static String PoltronaLivreS5D1;
   private static String PoltronaLivreS6D1;
   
   private static String PoltronaLivreS1D2;
   private static String PoltronaLivreS2D2;
   private static String PoltronaLivreS3D2;
   private static String PoltronaLivreS4D2;
   private static String PoltronaLivreS5D2;
   private static String PoltronaLivreS6D2;
   
   private static String PoltronaLivreS1D3;
   private static String PoltronaLivreS2D3;
   private static String PoltronaLivreS3D3;
   private static String PoltronaLivreS4D3;
   private static String PoltronaLivreS5D3;
   private static String PoltronaLivreS6D3;
   
   private static String PoltronaLivreS1D4;
   private static String PoltronaLivreS2D4;
   private static String PoltronaLivreS3D4;
   private static String PoltronaLivreS4D4;
   private static String PoltronaLivreS5D4;
   private static String PoltronaLivreS6D4;
   
   private static String PoltronaLivreS1D5;
   private static String PoltronaLivreS2D5;
   private static String PoltronaLivreS3D5;
   private static String PoltronaLivreS4D5;
   private static String PoltronaLivreS5D5;
   private static String PoltronaLivreS6D5;
 
   
   
   
   public static String getPoltronaLivreS1A3() {
	return PoltronaLivreS1A3;
}
   

public static void setPoltronaLivreS1A3(String poltronaLivreS1A3) {
	PoltronaLivreS1A3 = poltronaLivreS1A3;
}

public static String getPoltronaLivreS2A3() {
	return PoltronaLivreS2A3;
}

public static void setPoltronaLivreS2A3(String poltronaLivreS2A3) {
	PoltronaLivreS2A3 = poltronaLivreS2A3;
}

public static String getPoltronaLivreS3A3() {
	return PoltronaLivreS3A3;
}

public static void setPoltronaLivreS3A3(String poltronaLivreS3A3) {
	PoltronaLivreS3A3 = poltronaLivreS3A3;
}

public static String getPoltronaLivreS4A3() {
	return PoltronaLivreS4A3;
}

public static void setPoltronaLivreS4A3(String poltronaLivreS4A3) {
	PoltronaLivreS4A3 = poltronaLivreS4A3;
}

public static String getPoltronaLivreS5A3() {
	return PoltronaLivreS5A3;
}

public static void setPoltronaLivreS5A3(String poltronaLivreS5A3) {
	PoltronaLivreS5A3 = poltronaLivreS5A3;
}

public static String getPoltronaLivreS6A3() {
	return PoltronaLivreS6A3;
}

public static void setPoltronaLivreS6A3(String poltronaLivreS6A3) {
	PoltronaLivreS6A3 = poltronaLivreS6A3;
}

public static String getPoltronaLivreS1A4() {
	return PoltronaLivreS1A4;
}

public static void setPoltronaLivreS1A4(String poltronaLivreS1A4) {
	PoltronaLivreS1A4 = poltronaLivreS1A4;
}

public static String getPoltronaLivreS2A4() {
	return PoltronaLivreS2A4;
}

public static void setPoltronaLivreS2A4(String poltronaLivreS2A4) {
	PoltronaLivreS2A4 = poltronaLivreS2A4;
}

public static String getPoltronaLivreS3A4() {
	return PoltronaLivreS3A4;
}

public static void setPoltronaLivreS3A4(String poltronaLivreS3A4) {
	PoltronaLivreS3A4 = poltronaLivreS3A4;
}

public static String getPoltronaLivreS4A4() {
	return PoltronaLivreS4A4;
}

public static void setPoltronaLivreS4A4(String poltronaLivreS4A4) {
	PoltronaLivreS4A4 = poltronaLivreS4A4;
}

public static String getPoltronaLivreS5A4() {
	return PoltronaLivreS5A4;
}

public static void setPoltronaLivreS5A4(String poltronaLivreS5A4) {
	PoltronaLivreS5A4 = poltronaLivreS5A4;
}

public static String getPoltronaLivreS6A4() {
	return PoltronaLivreS6A4;
}

public static void setPoltronaLivreS6A4(String poltronaLivreS6A4) {
	PoltronaLivreS6A4 = poltronaLivreS6A4;
}

public static String getPoltronaLivreS1A5() {
	return PoltronaLivreS1A5;
}

public static void setPoltronaLivreS1A5(String poltronaLivreS1A5) {
	PoltronaLivreS1A5 = poltronaLivreS1A5;
}

public static String getPoltronaLivreS2A5() {
	return PoltronaLivreS2A5;
}

public static void setPoltronaLivreS2A5(String poltronaLivreS2A5) {
	PoltronaLivreS2A5 = poltronaLivreS2A5;
}

public static String getPoltronaLivreS3A5() {
	return PoltronaLivreS3A5;
}

public static void setPoltronaLivreS3A5(String poltronaLivreS3A5) {
	PoltronaLivreS3A5 = poltronaLivreS3A5;
}

public static String getPoltronaLivreS4A5() {
	return PoltronaLivreS4A5;
}

public static void setPoltronaLivreS4A5(String poltronaLivreS4A5) {
	PoltronaLivreS4A5 = poltronaLivreS4A5;
}

public static String getPoltronaLivreS5A5() {
	return PoltronaLivreS5A5;
}

public static void setPoltronaLivreS5A5(String poltronaLivreS5A5) {
	PoltronaLivreS5A5 = poltronaLivreS5A5;
}

public static String getPoltronaLivreS6A5() {
	return PoltronaLivreS6A5;
}

public static void setPoltronaLivreS6A5(String poltronaLivreS6A5) {
	PoltronaLivreS6A5 = poltronaLivreS6A5;
}

public static String getPoltronaLivreS1B1() {
	return PoltronaLivreS1B1;
}

public static void setPoltronaLivreS1B1(String poltronaLivreS1B1) {
	PoltronaLivreS1B1 = poltronaLivreS1B1;
}

public static String getPoltronaLivreS2B1() {
	return PoltronaLivreS2B1;
}

public static void setPoltronaLivreS2B1(String poltronaLivreS2B1) {
	PoltronaLivreS2B1 = poltronaLivreS2B1;
}

public static String getPoltronaLivreS3B1() {
	return PoltronaLivreS3B1;
}

public static void setPoltronaLivreS3B1(String poltronaLivreS3B1) {
	PoltronaLivreS3B1 = poltronaLivreS3B1;
}

public static String getPoltronaLivreS4B1() {
	return PoltronaLivreS4B1;
}

public static void setPoltronaLivreS4B1(String poltronaLivreS4B1) {
	PoltronaLivreS4B1 = poltronaLivreS4B1;
}

public static String getPoltronaLivreS5B1() {
	return PoltronaLivreS5B1;
}

public static void setPoltronaLivreS5B1(String poltronaLivreS5B1) {
	PoltronaLivreS5B1 = poltronaLivreS5B1;
}

public static String getPoltronaLivreS6B1() {
	return PoltronaLivreS6B1;
}

public static void setPoltronaLivreS6B1(String poltronaLivreS6B1) {
	PoltronaLivreS6B1 = poltronaLivreS6B1;
}

public static String getPoltronaLivreS1B2() {
	return PoltronaLivreS1B2;
}

public static void setPoltronaLivreS1B2(String poltronaLivreS1B2) {
	PoltronaLivreS1B2 = poltronaLivreS1B2;
}

public static String getPoltronaLivreS2B2() {
	return PoltronaLivreS2B2;
}

public static void setPoltronaLivreS2B2(String poltronaLivreS2B2) {
	PoltronaLivreS2B2 = poltronaLivreS2B2;
}

public static String getPoltronaLivreS3B2() {
	return PoltronaLivreS3B2;
}

public static void setPoltronaLivreS3B2(String poltronaLivreS3B2) {
	PoltronaLivreS3B2 = poltronaLivreS3B2;
}

public static String getPoltronaLivreS4B2() {
	return PoltronaLivreS4B2;
}

public static void setPoltronaLivreS4B2(String poltronaLivreS4B2) {
	PoltronaLivreS4B2 = poltronaLivreS4B2;
}

public static String getPoltronaLivreS5B2() {
	return PoltronaLivreS5B2;
}

public static void setPoltronaLivreS5B2(String poltronaLivreS5B2) {
	PoltronaLivreS5B2 = poltronaLivreS5B2;
}

public static String getPoltronaLivreS6B2() {
	return PoltronaLivreS6B2;
}

public static void setPoltronaLivreS6B2(String poltronaLivreS6B2) {
	PoltronaLivreS6B2 = poltronaLivreS6B2;
}

public static String getPoltronaLivreS1B3() {
	return PoltronaLivreS1B3;
}

public static void setPoltronaLivreS1B3(String poltronaLivreS1B3) {
	PoltronaLivreS1B3 = poltronaLivreS1B3;
}

public static String getPoltronaLivreS2B3() {
	return PoltronaLivreS2B3;
}

public static void setPoltronaLivreS2B3(String poltronaLivreS2B3) {
	PoltronaLivreS2B3 = poltronaLivreS2B3;
}

public static String getPoltronaLivreS3B3() {
	return PoltronaLivreS3B3;
}

public static void setPoltronaLivreS3B3(String poltronaLivreS3B3) {
	PoltronaLivreS3B3 = poltronaLivreS3B3;
}

public static String getPoltronaLivreS4B3() {
	return PoltronaLivreS4B3;
}

public static void setPoltronaLivreS4B3(String poltronaLivreS4B3) {
	PoltronaLivreS4B3 = poltronaLivreS4B3;
}

public static String getPoltronaLivreS5B3() {
	return PoltronaLivreS5B3;
}

public static void setPoltronaLivreS5B3(String poltronaLivreS5B3) {
	PoltronaLivreS5B3 = poltronaLivreS5B3;
}

public static String getPoltronaLivreS6B3() {
	return PoltronaLivreS6B3;
}

public static void setPoltronaLivreS6B3(String poltronaLivreS6B3) {
	PoltronaLivreS6B3 = poltronaLivreS6B3;
}

public static String getPoltronaLivreS1B4() {
	return PoltronaLivreS1B4;
}

public static void setPoltronaLivreS1B4(String poltronaLivreS1B4) {
	PoltronaLivreS1B4 = poltronaLivreS1B4;
}

public static String getPoltronaLivreS2B4() {
	return PoltronaLivreS2B4;
}

public static void setPoltronaLivreS2B4(String poltronaLivreS2B4) {
	PoltronaLivreS2B4 = poltronaLivreS2B4;
}

public static String getPoltronaLivreS3B4() {
	return PoltronaLivreS3B4;
}

public static void setPoltronaLivreS3B4(String poltronaLivreS3B4) {
	PoltronaLivreS3B4 = poltronaLivreS3B4;
}

public static String getPoltronaLivreS4B4() {
	return PoltronaLivreS4B4;
}

public static void setPoltronaLivreS4B4(String poltronaLivreS4B4) {
	PoltronaLivreS4B4 = poltronaLivreS4B4;
}

public static String getPoltronaLivreS5B4() {
	return PoltronaLivreS5B4;
}

public static void setPoltronaLivreS5B4(String poltronaLivreS5B4) {
	PoltronaLivreS5B4 = poltronaLivreS5B4;
}

public static String getPoltronaLivreS6B4() {
	return PoltronaLivreS6B4;
}

public static void setPoltronaLivreS6B4(String poltronaLivreS6B4) {
	PoltronaLivreS6B4 = poltronaLivreS6B4;
}

public static String getPoltronaLivreS1B5() {
	return PoltronaLivreS1B5;
}

public static void setPoltronaLivreS1B5(String poltronaLivreS1B5) {
	PoltronaLivreS1B5 = poltronaLivreS1B5;
}

public static String getPoltronaLivreS2B5() {
	return PoltronaLivreS2B5;
}

public static void setPoltronaLivreS2B5(String poltronaLivreS2B5) {
	PoltronaLivreS2B5 = poltronaLivreS2B5;
}

public static String getPoltronaLivreS3B5() {
	return PoltronaLivreS3B5;
}

public static void setPoltronaLivreS3B5(String poltronaLivreS3B5) {
	PoltronaLivreS3B5 = poltronaLivreS3B5;
}

public static String getPoltronaLivreS4B5() {
	return PoltronaLivreS4B5;
}

public static void setPoltronaLivreS4B5(String poltronaLivreS4B5) {
	PoltronaLivreS4B5 = poltronaLivreS4B5;
}

public static String getPoltronaLivreS5B5() {
	return PoltronaLivreS5B5;
}

public static void setPoltronaLivreS5B5(String poltronaLivreS5B5) {
	PoltronaLivreS5B5 = poltronaLivreS5B5;
}

public static String getPoltronaLivreS6B5() {
	return PoltronaLivreS6B5;
}

public static void setPoltronaLivreS6B5(String poltronaLivreS6B5) {
	PoltronaLivreS6B5 = poltronaLivreS6B5;
}

public static String getPoltronaLivreS1C1() {
	return PoltronaLivreS1C1;
}

public static void setPoltronaLivreS1C1(String poltronaLivreS1C1) {
	PoltronaLivreS1C1 = poltronaLivreS1C1;
}

public static String getPoltronaLivreS2C1() {
	return PoltronaLivreS2C1;
}

public static void setPoltronaLivreS2C1(String poltronaLivreS2C1) {
	PoltronaLivreS2C1 = poltronaLivreS2C1;
}

public static String getPoltronaLivreS3C1() {
	return PoltronaLivreS3C1;
}

public static void setPoltronaLivreS3C1(String poltronaLivreS3C1) {
	PoltronaLivreS3C1 = poltronaLivreS3C1;
}

public static String getPoltronaLivreS4C1() {
	return PoltronaLivreS4C1;
}

public static void setPoltronaLivreS4C1(String poltronaLivreS4C1) {
	PoltronaLivreS4C1 = poltronaLivreS4C1;
}

public static String getPoltronaLivreS5C1() {
	return PoltronaLivreS5C1;
}

public static void setPoltronaLivreS5C1(String poltronaLivreS5C1) {
	PoltronaLivreS5C1 = poltronaLivreS5C1;
}

public static String getPoltronaLivreS6C1() {
	return PoltronaLivreS6C1;
}

public static void setPoltronaLivreS6C1(String poltronaLivreS6C1) {
	PoltronaLivreS6C1 = poltronaLivreS6C1;
}

public static String getPoltronaLivreS1C2() {
	return PoltronaLivreS1C2;
}

public static void setPoltronaLivreS1C2(String poltronaLivreS1C2) {
	PoltronaLivreS1C2 = poltronaLivreS1C2;
}

public static String getPoltronaLivreS2C2() {
	return PoltronaLivreS2C2;
}

public static void setPoltronaLivreS2C2(String poltronaLivreS2C2) {
	PoltronaLivreS2C2 = poltronaLivreS2C2;
}

public static String getPoltronaLivreS3C2() {
	return PoltronaLivreS3C2;
}

public static void setPoltronaLivreS3C2(String poltronaLivreS3C2) {
	PoltronaLivreS3C2 = poltronaLivreS3C2;
}

public static String getPoltronaLivreS4C2() {
	return PoltronaLivreS4C2;
}

public static void setPoltronaLivreS4C2(String poltronaLivreS4C2) {
	PoltronaLivreS4C2 = poltronaLivreS4C2;
}

public static String getPoltronaLivreS5C2() {
	return PoltronaLivreS5C2;
}

public static void setPoltronaLivreS5C2(String poltronaLivreS5C2) {
	PoltronaLivreS5C2 = poltronaLivreS5C2;
}

public static String getPoltronaLivreS6C2() {
	return PoltronaLivreS6C2;
}

public static void setPoltronaLivreS6C2(String poltronaLivreS6C2) {
	PoltronaLivreS6C2 = poltronaLivreS6C2;
}

public static String getPoltronaLivreS1C3() {
	return PoltronaLivreS1C3;
}

public static void setPoltronaLivreS1C3(String poltronaLivreS1C3) {
	PoltronaLivreS1C3 = poltronaLivreS1C3;
}

public static String getPoltronaLivreS2C3() {
	return PoltronaLivreS2C3;
}

public static void setPoltronaLivreS2C3(String poltronaLivreS2C3) {
	PoltronaLivreS2C3 = poltronaLivreS2C3;
}

public static String getPoltronaLivreS3C3() {
	return PoltronaLivreS3C3;
}

public static void setPoltronaLivreS3C3(String poltronaLivreS3C3) {
	PoltronaLivreS3C3 = poltronaLivreS3C3;
}

public static String getPoltronaLivreS4C3() {
	return PoltronaLivreS4C3;
}

public static void setPoltronaLivreS4C3(String poltronaLivreS4C3) {
	PoltronaLivreS4C3 = poltronaLivreS4C3;
}

public static String getPoltronaLivreS5C3() {
	return PoltronaLivreS5C3;
}

public static void setPoltronaLivreS5C3(String poltronaLivreS5C3) {
	PoltronaLivreS5C3 = poltronaLivreS5C3;
}

public static String getPoltronaLivreS6C3() {
	return PoltronaLivreS6C3;
}

public static void setPoltronaLivreS6C3(String poltronaLivreS6C3) {
	PoltronaLivreS6C3 = poltronaLivreS6C3;
}

public static String getPoltronaLivreS1C4() {
	return PoltronaLivreS1C4;
}

public static void setPoltronaLivreS1C4(String poltronaLivreS1C4) {
	PoltronaLivreS1C4 = poltronaLivreS1C4;
}

public static String getPoltronaLivreS2C4() {
	return PoltronaLivreS2C4;
}

public static void setPoltronaLivreS2C4(String poltronaLivreS2C4) {
	PoltronaLivreS2C4 = poltronaLivreS2C4;
}

public static String getPoltronaLivreS3C4() {
	return PoltronaLivreS3C4;
}

public static void setPoltronaLivreS3C4(String poltronaLivreS3C4) {
	PoltronaLivreS3C4 = poltronaLivreS3C4;
}

public static String getPoltronaLivreS4C4() {
	return PoltronaLivreS4C4;
}

public static void setPoltronaLivreS4C4(String poltronaLivreS4C4) {
	PoltronaLivreS4C4 = poltronaLivreS4C4;
}

public static String getPoltronaLivreS5C4() {
	return PoltronaLivreS5C4;
}

public static void setPoltronaLivreS5C4(String poltronaLivreS5C4) {
	PoltronaLivreS5C4 = poltronaLivreS5C4;
}

public static String getPoltronaLivreS6C4() {
	return PoltronaLivreS6C4;
}

public static void setPoltronaLivreS6C4(String poltronaLivreS6C4) {
	PoltronaLivreS6C4 = poltronaLivreS6C4;
}

public static String getPoltronaLivreS1C5() {
	return PoltronaLivreS1C5;
}

public static void setPoltronaLivreS1C5(String poltronaLivreS1C5) {
	PoltronaLivreS1C5 = poltronaLivreS1C5;
}

public static String getPoltronaLivreS2C5() {
	return PoltronaLivreS2C5;
}

public static void setPoltronaLivreS2C5(String poltronaLivreS2C5) {
	PoltronaLivreS2C5 = poltronaLivreS2C5;
}

public static String getPoltronaLivreS3C5() {
	return PoltronaLivreS3C5;
}

public static void setPoltronaLivreS3C5(String poltronaLivreS3C5) {
	PoltronaLivreS3C5 = poltronaLivreS3C5;
}

public static String getPoltronaLivreS4C5() {
	return PoltronaLivreS4C5;
}

public static void setPoltronaLivreS4C5(String poltronaLivreS4C5) {
	PoltronaLivreS4C5 = poltronaLivreS4C5;
}

public static String getPoltronaLivreS5C5() {
	return PoltronaLivreS5C5;
}

public static void setPoltronaLivreS5C5(String poltronaLivreS5C5) {
	PoltronaLivreS5C5 = poltronaLivreS5C5;
}

public static String getPoltronaLivreS6C5() {
	return PoltronaLivreS6C5;
}

public static void setPoltronaLivreS6C5(String poltronaLivreS6C5) {
	PoltronaLivreS6C5 = poltronaLivreS6C5;
}

public static String getPoltronaLivreS1D1() {
	return PoltronaLivreS1D1;
}

public static void setPoltronaLivreS1D1(String poltronaLivreS1D1) {
	PoltronaLivreS1D1 = poltronaLivreS1D1;
}

public static String getPoltronaLivreS2D1() {
	return PoltronaLivreS2D1;
}

public static void setPoltronaLivreS2D1(String poltronaLivreS2D1) {
	PoltronaLivreS2D1 = poltronaLivreS2D1;
}

public static String getPoltronaLivreS3D1() {
	return PoltronaLivreS3D1;
}

public static void setPoltronaLivreS3D1(String poltronaLivreS3D1) {
	PoltronaLivreS3D1 = poltronaLivreS3D1;
}

public static String getPoltronaLivreS4D1() {
	return PoltronaLivreS4D1;
}

public static void setPoltronaLivreS4D1(String poltronaLivreS4D1) {
	PoltronaLivreS4D1 = poltronaLivreS4D1;
}

public static String getPoltronaLivreS5D1() {
	return PoltronaLivreS5D1;
}

public static void setPoltronaLivreS5D1(String poltronaLivreS5D1) {
	PoltronaLivreS5D1 = poltronaLivreS5D1;
}

public static String getPoltronaLivreS6D1() {
	return PoltronaLivreS6D1;
}

public static void setPoltronaLivreS6D1(String poltronaLivreS6D1) {
	PoltronaLivreS6D1 = poltronaLivreS6D1;
}

public static String getPoltronaLivreS1D2() {
	return PoltronaLivreS1D2;
}

public static void setPoltronaLivreS1D2(String poltronaLivreS1D2) {
	PoltronaLivreS1D2 = poltronaLivreS1D2;
}

public static String getPoltronaLivreS2D2() {
	return PoltronaLivreS2D2;
}

public static void setPoltronaLivreS2D2(String poltronaLivreS2D2) {
	PoltronaLivreS2D2 = poltronaLivreS2D2;
}

public static String getPoltronaLivreS3D2() {
	return PoltronaLivreS3D2;
}

public static void setPoltronaLivreS3D2(String poltronaLivreS3D2) {
	PoltronaLivreS3D2 = poltronaLivreS3D2;
}

public static String getPoltronaLivreS4D2() {
	return PoltronaLivreS4D2;
}

public static void setPoltronaLivreS4D2(String poltronaLivreS4D2) {
	PoltronaLivreS4D2 = poltronaLivreS4D2;
}

public static String getPoltronaLivreS5D2() {
	return PoltronaLivreS5D2;
}

public static void setPoltronaLivreS5D2(String poltronaLivreS5D2) {
	PoltronaLivreS5D2 = poltronaLivreS5D2;
}

public static String getPoltronaLivreS6D2() {
	return PoltronaLivreS6D2;
}

public static void setPoltronaLivreS6D2(String poltronaLivreS6D2) {
	PoltronaLivreS6D2 = poltronaLivreS6D2;
}

public static String getPoltronaLivreS1D3() {
	return PoltronaLivreS1D3;
}

public static void setPoltronaLivreS1D3(String poltronaLivreS1D3) {
	PoltronaLivreS1D3 = poltronaLivreS1D3;
}

public static String getPoltronaLivreS2D3() {
	return PoltronaLivreS2D3;
}

public static void setPoltronaLivreS2D3(String poltronaLivreS2D3) {
	PoltronaLivreS2D3 = poltronaLivreS2D3;
}

public static String getPoltronaLivreS3D3() {
	return PoltronaLivreS3D3;
}

public static void setPoltronaLivreS3D3(String poltronaLivreS3D3) {
	PoltronaLivreS3D3 = poltronaLivreS3D3;
}

public static String getPoltronaLivreS4D3() {
	return PoltronaLivreS4D3;
}

public static void setPoltronaLivreS4D3(String poltronaLivreS4D3) {
	PoltronaLivreS4D3 = poltronaLivreS4D3;
}

public static String getPoltronaLivreS5D3() {
	return PoltronaLivreS5D3;
}

public static void setPoltronaLivreS5D3(String poltronaLivreS5D3) {
	PoltronaLivreS5D3 = poltronaLivreS5D3;
}

public static String getPoltronaLivreS6D3() {
	return PoltronaLivreS6D3;
}

public static void setPoltronaLivreS6D3(String poltronaLivreS6D3) {
	PoltronaLivreS6D3 = poltronaLivreS6D3;
}

public static String getPoltronaLivreS1D4() {
	return PoltronaLivreS1D4;
}

public static void setPoltronaLivreS1D4(String poltronaLivreS1D4) {
	PoltronaLivreS1D4 = poltronaLivreS1D4;
}

public static String getPoltronaLivreS2D4() {
	return PoltronaLivreS2D4;
}

public static void setPoltronaLivreS2D4(String poltronaLivreS2D4) {
	PoltronaLivreS2D4 = poltronaLivreS2D4;
}

public static String getPoltronaLivreS3D4() {
	return PoltronaLivreS3D4;
}

public static void setPoltronaLivreS3D4(String poltronaLivreS3D4) {
	PoltronaLivreS3D4 = poltronaLivreS3D4;
}

public static String getPoltronaLivreS4D4() {
	return PoltronaLivreS4D4;
}

public static void setPoltronaLivreS4D4(String poltronaLivreS4D4) {
	PoltronaLivreS4D4 = poltronaLivreS4D4;
}

public static String getPoltronaLivreS5D4() {
	return PoltronaLivreS5D4;
}

public static void setPoltronaLivreS5D4(String poltronaLivreS5D4) {
	PoltronaLivreS5D4 = poltronaLivreS5D4;
}

public static String getPoltronaLivreS6D4() {
	return PoltronaLivreS6D4;
}

public static void setPoltronaLivreS6D4(String poltronaLivreS6D4) {
	PoltronaLivreS6D4 = poltronaLivreS6D4;
}

public static String getPoltronaLivreS1D5() {
	return PoltronaLivreS1D5;
}

public static void setPoltronaLivreS1D5(String poltronaLivreS1D5) {
	PoltronaLivreS1D5 = poltronaLivreS1D5;
}

public static String getPoltronaLivreS2D5() {
	return PoltronaLivreS2D5;
}

public static void setPoltronaLivreS2D5(String poltronaLivreS2D5) {
	PoltronaLivreS2D5 = poltronaLivreS2D5;
}

public static String getPoltronaLivreS3D5() {
	return PoltronaLivreS3D5;
}

public static void setPoltronaLivreS3D5(String poltronaLivreS3D5) {
	PoltronaLivreS3D5 = poltronaLivreS3D5;
}

public static String getPoltronaLivreS4D5() {
	return PoltronaLivreS4D5;
}

public static void setPoltronaLivreS4D5(String poltronaLivreS4D5) {
	PoltronaLivreS4D5 = poltronaLivreS4D5;
}

public static String getPoltronaLivreS5D5() {
	return PoltronaLivreS5D5;
}

public static void setPoltronaLivreS5D5(String poltronaLivreS5D5) {
	PoltronaLivreS5D5 = poltronaLivreS5D5;
}

public static String getPoltronaLivreS6D5() {
	return PoltronaLivreS6D5;
}

public static void setPoltronaLivreS6D5(String poltronaLivreS6D5) {
	PoltronaLivreS6D5 = poltronaLivreS6D5;
}
    
	public static String getPoltronaLivreS1A2() {
	return PoltronaLivreS1A2;
}

public static void setPoltronaLivreS1A2(String poltronaLivreS1A2) {
	PoltronaLivreS1A2 = poltronaLivreS1A2;
}

public static String getPoltronaLivreS2A2() {
	return PoltronaLivreS2A2;
}

public static void setPoltronaLivreS2A2(String poltronaLivreS2A2) {
	PoltronaLivreS2A2 = poltronaLivreS2A2;
}

public static String getPoltronaLivreS3A2() {
	return PoltronaLivreS3A2;
}

public static void setPoltronaLivreS3A2(String poltronaLivreS3A2) {
	PoltronaLivreS3A2 = poltronaLivreS3A2;
}

public static String getPoltronaLivreS4A2() {
	return PoltronaLivreS4A2;
}

public static void setPoltronaLivreS4A2(String poltronaLivreS4A2) {
	PoltronaLivreS4A2 = poltronaLivreS4A2;
}

public static String getPoltronaLivreS5A2() {
	return ControlePoltrona.PoltronaLivreS5A2;
}

public static void setPoltronaLivreS5A2(String poltronaLivreS5A2) {
	ControlePoltrona.PoltronaLivreS5A2 = poltronaLivreS5A2;
}

public static String getPoltronaLivreS6A2() {
	return PoltronaLivreS6A2;
}

public static void setPoltronaLivreS6A2(String poltronaLivreS6A2) {
	PoltronaLivreS6A2 = poltronaLivreS6A2;
}

	public static String getPoltronaLivreS1() {
		return PoltronaLivreS1;
	}

	public static void setPoltronaLivreS1(String poltronaLivreS1) {
		PoltronaLivreS1 = poltronaLivreS1;
	}
	
	public static String getPoltronaLivreS2() {
		return PoltronaLivreS2;
	}
	
	public static void  setPoltronaLivreS2(String poltronaLivreS2) {
		PoltronaLivreS2 = poltronaLivreS2;
	}
	
	public static String getPoltronaLivreS3() {
		return PoltronaLivreS3;
	}
	
	public static void setPoltronaLivreS3(String poltronaLivreS3) {
		PoltronaLivreS3 = poltronaLivreS3;
	}
	
	public static String getPoltronaLivreS4() {
		return PoltronaLivreS4;
	}
	
	public static void setPoltronaLivreS4(String poltronaLivreS4) {
		PoltronaLivreS4 = poltronaLivreS4;
	}
	
	public static String getPoltronaLivreS5() {
		return PoltronaLivreS5;
	}
	
	public static void setPoltronaLivreS5(String poltronaLivreS5) {
		PoltronaLivreS5 = poltronaLivreS5;
	}
	
	public static String getPoltronaLivreS6() {
		return PoltronaLivreS6;
	}
	
	public static void setPoltronaLivreS6(String poltronaLivreS6) {
		PoltronaLivreS6 = poltronaLivreS6;
	}

	
	public int getPreco() {
		return preco;
	}
	
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public void subtracao(int preco) {
		this.preco -= preco;
	}

	public int soma(int preco) {
		return this.preco += preco;
	}
	
	public void pegarPoltronas(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona = new SelectPoltronas();
    	
    	poltrona.pegarPoltronas(i);
    	
    	}
	
	public void pegarPoltronasA2(String i) throws SQLException, ClassNotFoundException{
		SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	}
	
	public void pegarPoltronasA3(String i) throws SQLException, ClassNotFoundException{
		SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
		
    	}
	
	public void pegarPoltronasA4(String i) throws SQLException, ClassNotFoundException{
		SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
	}
	
	public void pegarPoltronasA5(String i) throws SQLException, ClassNotFoundException{
		SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
    	}
	
    public void pegarPoltronasB1(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
         }
    
    public void pegarPoltronasB2(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }
    
    public void pegarPoltronasB3(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }

	
    public void pegarPoltronasB4(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }
    
    public void pegarPoltronasB5(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }
    
    public void pegarPoltronasD1(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }
    
    
    public void pegarPoltronasD2(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }
    
    public void pegarPoltronasD3(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }
    
    public void pegarPoltronasD4(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }
    
    
    public void pegarPoltronasD5(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }
    
    public void pegarPoltronasC1(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }

    public void pegarPoltronasC2(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }
    
    public void pegarPoltronasC3(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }
    
    public void pegarPoltronasC4(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }
    
    public void pegarPoltronasC5(String i) throws SQLException, ClassNotFoundException{
    	SelectPoltronas poltrona2 = new SelectPoltronas();
    	
    	poltrona2.pegarPoltronas(i);
    	
        }
}
