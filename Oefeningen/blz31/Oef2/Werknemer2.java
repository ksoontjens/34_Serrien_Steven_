import java.lang. *; 


/**
* Deze klasse is een java programma
* @author Ruben Wouters
* @version 1,5
*/

public class Werknemer2{

	public String voornaam;
	public String achternaam;
	public int werknemerNummer;
	protected float salaris;

	public Werknemer2(String voornaam, String achternaam, int wNummer, float salaris)
	{
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.werknemerNummer = wNummer;
		this.salaris = salaris;
	}

	public void salarisVerhogen(int percentage)
	{
		float verhogingsfactor = (float)percentage/100;
		salaris += salaris * verhogingsfactor;
	}

	public float getSalaris()
	{
		return salaris;
	}
}