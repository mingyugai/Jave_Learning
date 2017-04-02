
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public String findSimpleGene(String dna, String startCodon, String stopCodon){
        int startIndex = dna.indexOf(startCodon);
        int endIndex = dna.indexOf(stopCodon , startIndex + 3);
        if (startIndex == -1 || endIndex == -1 ||((endIndex - startIndex) % 3 != 0)){
            return " ";
        }else{
            return dna.substring(startIndex, endIndex + 3);
        }
    }
    public void testSimpleGene(){
        String dna = "AATGCGAAAATCG";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna, "ATG", "TAA");
        System.out.println("Gene is " + gene);
        //
        dna = "CGGTTGATAAGCCTAAGCTATAA";
        dna = dna.toLowerCase();
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna, "atg", "taa");;
        System.out.println("Gene is " + gene);
        //       
        dna = "CGATGGTTGATAAGCCTAAGCTAAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna, "ATG", "TAA");;
        System.out.println("Gene is " + gene);
        //
        dna = "CGATGGTTTAAGCCTAAGCTAAA";
        dna = dna.toLowerCase();
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna, "atg", "taa");;
        System.out.println("Gene is " + gene);
    }

}
