
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Res {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> ng=new ArrayList<>();
        for(int m:grades)
        {
            if(m<38)
            {
                ng.add(m);
            }else {
                int r=m%5;
                int d=5-r;
                if(d<3)
                    ng.add(m+d);
                else
                    ng.add(m);
            }
        }
        return ng;
    }

}

public class gradingStudent {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> results = Res.gradingStudents(grades);

        System.out.println(results.stream().map(Object::toString).collect(joining("\n")));

        bufferedReader.close();
        
    }
}
