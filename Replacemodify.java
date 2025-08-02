package skill;

class Replacemodify {
    public static void main(String[] args) {
        String s = "Rahul";
        System.out.println(s.replace('R', 'r'));         
        System.out.println(s.replace("a", "A"));     
        System.out.println(s.replaceAll("h", "H"));    
        System.out.println(s.replaceFirst("u ","U")); 
    }
}