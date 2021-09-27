public class NumberTester implements NumberTest {

    private NumberTest primeTester;
    private NumberTest oddTester;
    private NumberTest palindromeTester;

    public NumberTester(String fileName){

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

    }

    @Override
    public boolean testNumber(int number) {
        return false;
    }
}
