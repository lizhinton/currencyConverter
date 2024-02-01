package model;

public class CurrencyConverter {
//variables
	double USDollars;
	double mexicanPesos;
	double euros;
	double japaneseYen;
	double pesoRate = 17.08;
	double euroRate = .92;
	double yenRate = 146.40;
//constructors
	public CurrencyConverter(double dollars) {
		USDollars = dollars;
		mexicanPesos = pesoConversion(dollars);
		euros = euroConversion(dollars);
		japaneseYen = yenConversion(dollars);
	}
//getters
	public double getUSDollars() {
		return USDollars;
	}
	
	public double getMexicanPesos() {
		return mexicanPesos;
	}
	
	public double getEuros() {
		return euros;
	}
	
	public double getJapaneseYen() {
		return japaneseYen;
	}
//methods
	public String toString(){
		return "You have " + USDollars + " US dollars, which is equivalent to " + mexicanPesos + " mexican pesos, " + euros + " euros, or " + japaneseYen + " japanese Yen.";
	}
	
	public double pesoConversion(double dollars) {
		return dollars * pesoRate;
	}
	
	public double euroConversion(double dollars) {
		return dollars * euroRate;
	}
	
	public double yenConversion(double dollars) {
		return dollars * yenRate;
	}
}
