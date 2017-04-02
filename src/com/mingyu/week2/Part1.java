
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    public String findSimpleGene(String dna){
        int startIndex = dna.indexOf("ATG");
        int endIndex = dna.indexOf("TAA",startIndex + 3);
        if (startIndex == -1 || endIndex == -1 ||((endIndex - startIndex) % 3 != 0)){
            return " ";
        }else{
            return dna.substring(startIndex, endIndex + 3);
        }
    }
    public void testSimpleGene(){
        String dna = "AATGCGAAAATCG";
        System.out.println("DNA strand is " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        //
        dna = "CGGTTGATAAGCCTAAGCTATAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        //       
        dna = "CGATGGTTGATAAGCCTAAGCTAAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
        //
        dna = "CGATGGTTTAAGCCTAAGCTAAA";
        System.out.println("DNA strand is " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is " + gene);
    }
}
