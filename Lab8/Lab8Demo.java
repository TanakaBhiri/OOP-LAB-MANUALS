import java.util.*;
import java.util.regex.*;
public class Lab8Demo {
    static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for(int i=0;i<arr.length-1;i++)for(int j=0;j<arr.length-1-i;j++)
            if(arr[j].compareTo(arr[j+1])>0){T temp=arr[j];arr[j]=arr[j+1];arr[j+1]=temp;}
    }
    public static void main(String[] args) {
        List<Integer> values=new ArrayList<>(List.of(12,5,8,30,2,17,9,4,22,11));
        int sum=0,max=Integer.MIN_VALUE;for(int n:values){sum+=n;max=Math.max(max,n);}
        List<Integer> reverse=new ArrayList<>(values);Collections.reverse(reverse);
        System.out.println("List="+values+" sum="+sum+" max="+max+" reverse="+reverse);
        List<String> names=List.of("Tariro","Amai","Tariro","Kuda","Amai");
        System.out.println("Unique names="+new LinkedHashSet<>(names));
        Stack<String> stack=new Stack<>();stack.push("first");stack.push("second");System.out.println("peek="+stack.peek()+" pop="+stack.pop()+" empty="+stack.isEmpty());
        String paragraph="Java collections make Java programs useful; collections store words, and Java maps count words.";
        Map<String,Integer> freq=new HashMap<>();for(String word:paragraph.toLowerCase().split("[^a-z]+"))if(!word.isBlank())freq.merge(word,1,Integer::sum);
        freq.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
            .forEach(e->System.out.println(e.getKey()+" = "+e.getValue()));
        Integer[] ints={5,1,4,2};String[] words={"pear","apple","orange"};bubbleSort(ints);bubbleSort(words);
        System.out.println("Sorted integers="+Arrays.toString(ints));System.out.println("Sorted words="+Arrays.toString(words));
        // int[] cannot be used because generics require reference types; Integer[] works via wrapper objects.
    }
}