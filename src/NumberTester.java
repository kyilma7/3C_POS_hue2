import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester implements NumberTest {

    private final String fileName;
    private NumberTest primeTester;
    private NumberTest oddTester;
    private NumberTest palindromeTester;

    public NumberTester(String fileName){
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public void testFile(){
        String line;
        try (BufferedReader bfr = new BufferedReader(new FileReader("Tester.csv"))){
            line = bfr.readLine();
            while(line != null) {
                line = bfr.readLine();
                if (line != null) {
                    String[] array = line.split(";");
                    int numberCheck = Integer.parseInt(array[1]);
                    switch (array[0]) {
                        case "1":
                            NumberTest isEven = (n) -> (n%2) == 0;
                            setOddEvenTester(isEven);
                            if (oddTester.testNumber(numberCheck)){
                                System.out.println("EVEN");
                            }else{
                                System.out.println("ODD");
                            }
                            break;
                        case "2":
                            NumberTest isPrimeNumber = (n) -> n>2 && (n % 2) != 0 && (n % n) == 0;
                            setPrimeTester(isPrimeNumber);
                            if (primeTester.testNumber(numberCheck)){
                                System.out.println("PRIME");
                            }
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }
}
