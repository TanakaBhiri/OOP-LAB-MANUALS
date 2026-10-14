import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Lab10Demo {
    static String band(int marks){if(marks>=80)return "A";if(marks>=60)return "B";return "C";}
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);List<String> lines=new ArrayList<>();
        System.out.println("Enter five lines (press Enter on an empty line to use sample lines):");
        for(int i=0;i<5;i++){if(!sc.hasNextLine())break;String line=sc.nextLine();if(i==0&&line.isEmpty()){lines=List.of("First line","Java file I/O","Third line","Streams and lambdas","Fifth line");break;}lines.add(line);}
        Path path=Path.of("five-lines.txt");Files.write(path,lines);System.out.println("Saved and read back:");Files.readAllLines(path).forEach(System.out::println);
        List<Integer> nums=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));Predicate<Integer> even=n->n%2==0;nums.removeIf(even);System.out.println("Odd numbers only: "+nums);
        Path textFile=Path.of("sample-text.txt");if(!Files.exists(textFile))Files.writeString(textFile,"Java streams process text. Java files contain words.\nStreams can count words and lines.");
        List<String> fileLines=Files.readAllLines(textFile);long words=fileLines.stream().flatMap(s->Arrays.stream(s.trim().split("\\\\s+"))).filter(s->!s.isBlank()).count();
        long chars=fileLines.stream().mapToLong(String::length).sum();System.out.printf("Text stats: lines=%d words=%d characters=%d%n",fileLines.size(),words,chars);
        List<Student> students=List.of(new Student("Tariro",80),new Student("Amai",95),new Student("Kuda",60),new Student("Rudo",75));
        double avg=students.stream().mapToInt(Student::marks).average().orElse(0);
        System.out.println("Above average ("+avg+"): "+students.stream().filter(s->s.marks()>avg).map(Student::name).sorted().collect(Collectors.toList()));
        Path csv=Path.of("learners.csv");if(!Files.exists(csv))Files.write(csv,List.of("Tariro,85","Amai,72","Kuda,48","Rudo,91","Farai,65"));
        Map<String,List<String>> grouped=Files.readAllLines(csv).stream().filter(s->!s.isBlank()).map(s->s.split(","))
            .collect(Collectors.groupingBy(p->band(Integer.parseInt(p[1])),TreeMap::new,Collectors.mapping(p->p[0]+","+p[1],Collectors.toList())));
        for(String b:List.of("A","B","C"))Files.write(Path.of("grade-"+b+".txt"),grouped.getOrDefault(b,List.of()));
        System.out.println("Grade reports written: grade-A.txt, grade-B.txt, grade-C.txt");
    }
}