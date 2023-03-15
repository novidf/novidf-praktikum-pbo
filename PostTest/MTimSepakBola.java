//Nama file : MTimSepakBola.java
//Penulis 	: Novi Dwi Fitriani/24060121120027
//Tanggal	: 25/03/2023
//Deskripsi : Post Test

class MTimSepakbola {
  public static void main(String[] args) {
    // TODO: Make an instance called 'liverpool' -> use constructor which you have made before
	TimSepakbola liverpool = new TimSepakbola ("Liverpool");
    
	// TODO: Make an instance called 'manchesterUnited' -> use constructor which you have made before
    TimSepakbola manchesterUnited = new TimSepakbola ("Manchester United");

    // TODO: call startTandingBola()
	liverpool.startTandingBola(manchesterUnited);

		// Assume that liverpool wins against manchesterUnited 7 - 0
    for (int i = 0; i < 7; i++) {
  		liverpool.goal();
			
			// TODO: Replace [SKOR LIVERPOOL] and [SKOR MANCHESTERUNITED] with the correct METHOD
			// Code below should produce the output "Skor sementara: Liverpool 7 - 0 Manchester United"
			System.out.println("Skor sementara: " + liverpool.nama + " " + liverpool.skor + " - " + manchesterUnited.skor + " " + manchesterUnited.nama);
    }

		// TODO: call endTandingBola()
		liverpool.endTandingBola(manchesterUnited);
  }