import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        //Scanner keyboard = new Scanner(System.in);  
        //System.out.println("Enter Ciphertext: ");

        //String ciphertext = keyboard.nextLine(); 

        String ciphertext = ("lrvmnir bpr sumvbwvr jx bpr lmiwv yjeryrkbi jx qmbm wi bpr xjvni mkd ymibrut jx irhx wi bpr riirkvr jx ymbinlmtmipw utn qmumbr dj w ipmhh but bj rhnvwdmbr bpr yjeryrkbi jx bpr qmbm mvvjudwko bj yt wkbrusurbmbwjk lmird jk xjubt trmui jx ibndt wb wi kjb mk rmit bmiq bj rashmwk rmvp yjeryrkb mkd wbi iwokwxwvmkvr mkd ijyr ynib urymwk nkrashmwkrd bj ower m vjyshrbr rashmkmbwjk jkr cjnhd pmer bj lr fnmhwxwrd mkd wkiswurd bj invp mk rabrkb bpmb pr vjnhd urmvp bpr ibmbr jx rkhwopbrkrd ywkd vmsmlhr jx urvjokwgwko ijnkdhrii ijnkd mkd ipmsrhrii ipmsr w dj kjb drry ytirhx bpr xwkmh mnbpjuwbt lnb yt rasruwrkvr cwbp qmbm pmi hrxb kj djnlb bpmb bpr xjhhjcwko wi bpr sujsru msshwvmbwjk mkd wkbrusurbmbwjk w jxxru yt bprjuwri wk bpr pjsr bpmb bpr riirkvr jx jqwkmcmk qmumbr cwhh urymwk wkbmvb");

        System.out.println("---------------");

        LetterFrequency(ciphertext);
        System.out.println("---------------\n");

        Decipher(ciphertext);
    
        
    
    }
    static void LetterFrequency(String letters)
    {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < letters.length(); i++) 
        {
            char c = letters.charAt(i);
            Integer val = map.get(c);
            if (val != null) 
            {
                map.put(c, new Integer(val + 1));
            }
            else 
            {
               map.put(c, 1);
            }
        }
        System.out.print(map);
    }

    static void Decipher(String ciphertext)
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("r", "E");
        map.put("b", "T");
        map.put("m","A");
        map.put("k","N");
        map.put("j","O");
        map.put("w","I");
        map.put("i","S");
        map.put("p","H");
        map.put("u","R");
        map.put("d","D");
        map.put("h","L");
        map.put("v","C");
        map.put("x","F");
        map.put("y","M");
        map.put("n","U");
        map.put("s","P");
        map.put("t","Y");
        map.put("l","B");
        map.put("o","G");
        map.put("q","K");
        map.put("a","X");
        map.put("c","W");
        map.put("e","V");
        map.put("g","Z");
        map.put("f","Q");


        for (Map.Entry<String, String> entry : map.entrySet()) {
        ciphertext = ciphertext.replace(entry.getKey(), entry.getValue());
        }

        System.out.println(ciphertext);
    }




    }

