/*To Perform following operations:
 * The Test collection (Cranfield collection) is a standard IR text collection, consisting of
 * 1400 documents from the aerodynamics field.
 *  a program that preprocesses the collection. Only parse text between <TEXT>and </TEXT>.This preprocessing stage should specifically include:
   * a. Function that tokenizes the text. For this task, use your own implementation of a tokenizer.

 *Determine the frequency of occurrence for all the words in this collection.
Answer the following questions:
a. What is the vocabulary size? (i.e., number of unique terms)
b. What are the top 10 words in the ranking? (i.e., the words with the highest frequencies)
c. From these top 10 words, which are meaningful (i.e., they are not stopwords), and
which ones you would eliminate as stopwords.
Optional: d. What is the minimum number of unique words accounting for half of the
total number of words in the collection?
Example: if the total number of words in the collection is 100, and we have the following
word-frequency pairs: [the 30] [of 10] [a 10] [clear 8] [cut 7] etc. the answer to
this question will be 3 (3 unique words account for half of the total 100 words)
3] Integrate the Porter stemmer and a stopword eliminator into your code. Answer again
questions a-c from the previous point, question d is optional.

 *
 *
 * 
 */
package javaapplication1;

import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;




/*@author Amitkumar Vinayak Gundad
 *
 * 
 */

class Tok {

    final Map<String, Integer> frequencyMap = new TreeMap<String, Integer>();

    public TreeMap Tokenize() {
        int i;
        try {
            for (i = 1; i <= 9; i++) {
                FileReader fr = new FileReader("./cranfieldDocs/cranfield000" + i);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("newfile", true);
                String line = br.readLine();
                while ((line = br.readLine()) != null) {
                    String res = null;
                    String text1 = "<TEXT>";
                    String text2 = "</TEXT>";
 Pattern p = Pattern.compile("-[0-9]+");
                    if (line.equals(text1)) {

                        while (!((res = br.readLine()).equals(text2))) {
                             Matcher mat = p.matcher(res);
                            if(mat.find()){
                            StringTokenizer st = new StringTokenizer(res, "=;,./'-()#*+ ");
                            while (st.hasMoreTokens()) {
                                String tokn = st.nextToken();

                                Integer frequency = frequencyMap.get(tokn);
                                // Add the word if it doesn't already exist, otherwise increment the
                                // frequency counter.
                                if (frequency == null) {
                                    frequency = 0;
                                }
                                frequencyMap.put(tokn, frequency + 1);
                                fw.write(tokn + "\n");
                            }
                        }
                              else{
                                  StringTokenizer st = new StringTokenizer(res, "=;,./'()#*+ ");
                            while (st.hasMoreTokens()) {
                                String tokn = st.nextToken();

                                Integer frequency = frequencyMap.get(tokn);
                                // Add the word if it doesn't already exist, otherwise increment the
                                // frequency counter.
                                if (frequency == null) {
                                    frequency = 0;
                                }
                                frequencyMap.put(tokn, frequency + 1);
                                fw.write(tokn + "\n");
                              }
                    }

                        }
                    }

                }

                fw.close();
                fr.close();
            }

            for (i = 10; i <= 99; i++) {
                FileReader fr = new FileReader("./cranfieldDocs/cranfield00" + i);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("newfile", true);
                String line = br.readLine();
                while ((line = br.readLine()) != null) {
                    String res = null;
                    String text1 = "<TEXT>";
                    String text2 = "</TEXT>";
 Pattern p = Pattern.compile("-[0-9]+");
                    if (line.equals(text1)) {

                        while (!((res = br.readLine()).equals(text2))) {
                             Matcher mat = p.matcher(res);
                           if(mat.find()){
                            StringTokenizer st = new StringTokenizer(res, "=;,./'()-#*+ ");
                            while (st.hasMoreTokens()) {
                                String tokn = st.nextToken();

                                Integer frequency = frequencyMap.get(tokn);
                                // Add the word if it doesn't already exist, otherwise increment the
                                // frequency counter.
                                if (frequency == null) {
                                    frequency = 0;
                                }
                                frequencyMap.put(tokn, frequency + 1);
                                fw.write(tokn + "\n");
                            }
                        }
                              else{
                                  StringTokenizer st = new StringTokenizer(res, "=;,./'()#*+ ");
                            while (st.hasMoreTokens()) {
                                String tokn = st.nextToken();

                                Integer frequency = frequencyMap.get(tokn);
                                // Add the word if it doesn't already exist, otherwise increment the
                                // frequency counter.
                                if (frequency == null) {
                                    frequency = 0;
                                }
                                frequencyMap.put(tokn, frequency + 1);
                                fw.write(tokn + "\n");
                              }
                    }

                        }
                    }

                }

                fw.close();
                fr.close();
            }

            for (i = 100; i <= 999; i++) {
                FileReader fr = new FileReader("./cranfieldDocs/cranfield0" + i);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("newfile", true);
                String line = br.readLine();
                while ((line = br.readLine()) != null) {
                    String res = null;
                    String text1 = "<TEXT>";
                    String text2 = "</TEXT>";
                Pattern p = Pattern.compile("-[0-9]+");
                    if (line.equals(text1)) {

                        while (!((res = br.readLine()).equals(text2))) {
                             Matcher mat = p.matcher(res);
                              if(mat.find()){
                            StringTokenizer st = new StringTokenizer(res, "=;,./'()#*+- ");
                            while (st.hasMoreTokens()) {
                                String tokn = st.nextToken();

                                Integer frequency = frequencyMap.get(tokn);
                                // Add the word if it doesn't already exist, otherwise increment the
                                // frequency counter.
                                if (frequency == null) {
                                    frequency = 0;
                                }
                                frequencyMap.put(tokn, frequency + 1);
                                fw.write(tokn + "\n");
                            }
                        }
                              else{
                                  StringTokenizer st = new StringTokenizer(res, "=;,./'()#*+ ");
                            while (st.hasMoreTokens()) {
                                String tokn = st.nextToken();

                                Integer frequency = frequencyMap.get(tokn);
                                // Add the word if it doesn't already exist, otherwise increment the
                                // frequency counter.
                                if (frequency == null) {
                                    frequency = 0;
                                }
                                frequencyMap.put(tokn, frequency + 1);
                                fw.write(tokn + "\n");
                              }
                    }

                }
                    }
                }

                fw.close();
                fr.close();
            }
            for (i = 1000; i <= 1400; i++) {
                FileReader fr = new FileReader("./cranfieldDocs/cranfield" + i);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("newfile", true);
                String line = br.readLine();
                while ((line = br.readLine()) != null) {
                    String res = null;
                    String text1 = "<TEXT>";
                    String text2 = "</TEXT>";
 Pattern p = Pattern.compile("-[0-9]+");
                    if (line.equals(text1)) {

                        while (!((res = br.readLine()).equals(text2))) {
                             Matcher mat = p.matcher(res);
                           if(mat.find()){
                            StringTokenizer st = new StringTokenizer(res, "=;,./'()#*+- ");
                            while (st.hasMoreTokens()) {
                                String tokn = st.nextToken();

                                Integer frequency = frequencyMap.get(tokn);
                                // Add the word if it doesn't already exist, otherwise increment the
                                // frequency counter.
                                if (frequency == null) {
                                    frequency = 0;
                                }
                                frequencyMap.put(tokn, frequency + 1);
                                fw.write(tokn + "\n");
                            }
                        }
                              else{
                                  StringTokenizer st = new StringTokenizer(res, "=;,./'()#*+ ");
                            while (st.hasMoreTokens()) {
                                String tokn = st.nextToken();

                                Integer frequency = frequencyMap.get(tokn);
                                // Add the word if it doesn't already exist, otherwise increment the
                                // frequency counter.
                                if (frequency == null) {
                                    frequency = 0;
                                }
                                frequencyMap.put(tokn, frequency + 1);
                                fw.write(tokn + "\n");
                              }
                    }

                        }
                    }

                }

                fw.close();
                fr.close();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return (TreeMap) (frequencyMap);

    }
}
/**
 * Stemmer, implementing the Porter Stemming Algorithm
 *
 * The Stemmer class transforms a word into its root form.  The input
 * word can be provided a character at time (by calling add()), or at once
 * by calling one of the various stem(something) methods.
 */
class Stemmer {

    private char[] b;
    private int i, /* offset into b */
            i_end, /* offset to end of stemmed word */
            j, k;
    private static final int INC = 50;
    /* unit of size whereby b is increased */

    public Stemmer() {
        b = new char[INC];
        i = 0;
        i_end = 0;
    }

    /**
     * Add a character to the word being stemmed.  When you are finished
     * adding characters, you can call stem(void) to stem the word.
     */
    public void add(char ch) {
        if (i == b.length) {
            char[] new_b = new char[i + INC];
            for (int c = 0; c < i; c++) {
                new_b[c] = b[c];
            }
            b = new_b;
        }
        b[i++] = ch;
    }

    /** Adds wLen characters to the word being stemmed contained in a portion
     * of a char[] array. This is like repeated calls of add(char ch), but
     * faster.
     */
    public void add(char[] w, int wLen) {
        if (i + wLen >= b.length) {
            char[] new_b = new char[i + wLen + INC];
            for (int c = 0; c < i; c++) {
                new_b[c] = b[c];
            }
            b = new_b;
        }
        for (int c = 0; c < wLen; c++) {
            b[i++] = w[c];
        }
    }

    /**
     * After a word has been stemmed, it can be retrieved by toString(),
     * or a reference to the internal buffer can be retrieved by getResultBuffer
     * and getResultLength (which is generally more efficient.)
     */
    public String toString() {
        return new String(b, 0, i_end);
    }

    /**
     * Returns the length of the word resulting from the stemming process.
     */
    public int getResultLength() {
        return i_end;
    }

    /**
     * Returns a reference to a character buffer containing the results of
     * the stemming process.  You also need to consult getResultLength()
     * to determine the length of the result.
     */
    public char[] getResultBuffer() {
        return b;
    }

    /* cons(i) is true <=> b[i] is a consonant. */
    private final boolean cons(int i) {
        switch (b[i]) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return false;
            case 'y':
                return (i == 0) ? true : !cons(i - 1);
            default:
                return true;
        }
    }

    /* m() measures the number of consonant sequences between 0 and j. if c is
    a consonant sequence and v a vowel sequence, and <..> indicates arbitrary
    presence,

    <c><v>       gives 0
    <c>vc<v>     gives 1
    <c>vcvc<v>   gives 2
    <c>vcvcvc<v> gives 3
    ....
     */
    private final int m() {
        int n = 0;
        int i = 0;
        while (true) {
            if (i > j) {
                return n;
            }
            if (!cons(i)) {
                break;
            }
            i++;
        }
        i++;
        while (true) {
            while (true) {
                if (i > j) {
                    return n;
                }
                if (cons(i)) {
                    break;
                }
                i++;
            }
            i++;
            n++;
            while (true) {
                if (i > j) {
                    return n;
                }
                if (!cons(i)) {
                    break;
                }
                i++;
            }
            i++;
        }
    }

    /* vowelinstem() is true <=> 0,...j contains a vowel */
    private final boolean vowelinstem() {
        int i;
        for (i = 0; i <= j; i++) {
            if (!cons(i)) {
                return true;
            }
        }
        return false;
    }

    /* doublec(j) is true <=> j,(j-1) contain a double consonant. */
    private final boolean doublec(int j) {
        if (j < 1) {
            return false;
        }
        if (b[j] != b[j - 1]) {
            return false;
        }
        return cons(j);
    }

    /* cvc(i) is true <=> i-2,i-1,i has the form consonant - vowel - consonant
    and also if the second c is not w,x or y. this is used when trying to
    restore an e at the end of a short word. e.g.

    cav(e), lov(e), hop(e), crim(e), but
    snow, box, tray.

     */
    private final boolean cvc(int i) {
        if (i < 2 || !cons(i) || cons(i - 1) || !cons(i - 2)) {
            return false;
        }
        {
            int ch = b[i];
            if (ch == 'w' || ch == 'x' || ch == 'y') {
                return false;
            }
        }
        return true;
    }

    private final boolean ends(String s) {
        int l = s.length();
        int o = k - l + 1;
        if (o < 0) {
            return false;
        }
        for (int i = 0; i < l; i++) {
            if (b[o + i] != s.charAt(i)) {
                return false;
            }
        }
        j = k - l;
        return true;
    }

    /* setto(s) sets (j+1),...k to the characters in the string s, readjusting
    k. */
    private final void setto(String s) {
        int l = s.length();
        int o = j + 1;
        for (int i = 0; i < l; i++) {
            b[o + i] = s.charAt(i);
        }
        k = j + l;
    }

    /* r(s) is used further down. */
    private final void r(String s) {
        if (m() > 0) {
            setto(s);
        }
    }

    /* step1() gets rid of plurals and -ed or -ing. e.g.

    caresses  ->  caress
    ponies    ->  poni
    ties      ->  ti
    caress    ->  caress
    cats      ->  cat

    feed      ->  feed
    agreed    ->  agree
    disabled  ->  disable

    matting   ->  mat
    mating    ->  mate
    meeting   ->  meet
    milling   ->  mill
    messing   ->  mess

    meetings  ->  meet

     */
    private final void step1() {
        if (b[k] == 's') {
            if (ends("sses")) {
                k -= 2;
            } else if (ends("ies")) {
                setto("i");
            } else if (b[k - 1] != 's') {
                k--;
            }
        }
        if (ends("eed")) {
            if (m() > 0) {
                k--;
            }
        } else if ((ends("ed") || ends("ing")) && vowelinstem()) {
            k = j;
            if (ends("at")) {
                setto("ate");
            } else if (ends("bl")) {
                setto("ble");
            } else if (ends("iz")) {
                setto("ize");
            } else if (doublec(k)) {
                k--;
                {
                    int ch = b[k];
                    if (ch == 'l' || ch == 's' || ch == 'z') {
                        k++;
                    }
                }
            } else if (m() == 1 && cvc(k)) {
                setto("e");
            }
        }
    }

    /* step2() turns terminal y to i when there is another vowel in the stem. */
    private final void step2() {
        if (ends("y") && vowelinstem()) {
            b[k] = 'i';
        }
    }

    /* step3() maps double suffices to single ones. so -ization ( = -ize plus
    -ation) maps to -ize etc. note that the string before the suffix must give
    m() > 0. */
    private final void step3() {
        if (k == 0) {
            return;
        } /* For Bug 1 */ switch (b[k - 1]) {
            case 'a':
                if (ends("ational")) {
                    r("ate");
                    break;
                }
                if (ends("tional")) {
                    r("tion");
                    break;
                }
                break;
            case 'c':
                if (ends("enci")) {
                    r("ence");
                    break;
                }
                if (ends("anci")) {
                    r("ance");
                    break;
                }
                break;
            case 'e':
                if (ends("izer")) {
                    r("ize");
                    break;
                }
                break;
            case 'l':
                if (ends("bli")) {
                    r("ble");
                    break;
                }
                if (ends("alli")) {
                    r("al");
                    break;
                }
                if (ends("entli")) {
                    r("ent");
                    break;
                }
                if (ends("eli")) {
                    r("e");
                    break;
                }
                if (ends("ousli")) {
                    r("ous");
                    break;
                }
                break;
            case 'o':
                if (ends("ization")) {
                    r("ize");
                    break;
                }
                if (ends("ation")) {
                    r("ate");
                    break;
                }
                if (ends("ator")) {
                    r("ate");
                    break;
                }
                break;
            case 's':
                if (ends("alism")) {
                    r("al");
                    break;
                }
                if (ends("iveness")) {
                    r("ive");
                    break;
                }
                if (ends("fulness")) {
                    r("ful");
                    break;
                }
                if (ends("ousness")) {
                    r("ous");
                    break;
                }
                break;
            case 't':
                if (ends("aliti")) {
                    r("al");
                    break;
                }
                if (ends("iviti")) {
                    r("ive");
                    break;
                }
                if (ends("biliti")) {
                    r("ble");
                    break;
                }
                break;
            case 'g':
                if (ends("logi")) {
                    r("log");
                    break;
                }
        }
    }

    /* step4() deals with -ic-, -full, -ness etc. similar strategy to step3. */
    private final void step4() {
        switch (b[k]) {
            case 'e':
                if (ends("icate")) {
                    r("ic");
                    break;
                }
                if (ends("ative")) {
                    r("");
                    break;
                }
                if (ends("alize")) {
                    r("al");
                    break;
                }
                break;
            case 'i':
                if (ends("iciti")) {
                    r("ic");
                    break;
                }
                break;
            case 'l':
                if (ends("ical")) {
                    r("ic");
                    break;
                }
                if (ends("ful")) {
                    r("");
                    break;
                }
                break;
            case 's':
                if (ends("ness")) {
                    r("");
                    break;
                }
                break;
        }
    }

    /* step5() takes off -ant, -ence etc., in context <c>vcvc<v>. */
    private final void step5() {
        if (k == 0) {
            return;
        } /* for Bug 1 */ switch (b[k - 1]) {
            case 'a':
                if (ends("al")) {
                    break;
                }
                return;
            case 'c':
                if (ends("ance")) {
                    break;
                }
                if (ends("ence")) {
                    break;
                }
                return;
            case 'e':
                if (ends("er")) {
                    break;
                }
                return;
            case 'i':
                if (ends("ic")) {
                    break;
                }
                return;
            case 'l':
                if (ends("able")) {
                    break;
                }
                if (ends("ible")) {
                    break;
                }
                return;
            case 'n':
                if (ends("ant")) {
                    break;
                }
                if (ends("ement")) {
                    break;
                }
                if (ends("ment")) {
                    break;
                }
                /* element etc. not stripped before the m */
                if (ends("ent")) {
                    break;
                }
                return;
            case 'o':
                if (ends("ion") && j >= 0 && (b[j] == 's' || b[j] == 't')) {
                    break;
                }
                /* j >= 0 fixes Bug 2 */
                if (ends("ou")) {
                    break;
                }
                return;
            /* takes care of -ous */
            case 's':
                if (ends("ism")) {
                    break;
                }
                return;
            case 't':
                if (ends("ate")) {
                    break;
                }
                if (ends("iti")) {
                    break;
                }
                return;
            case 'u':
                if (ends("ous")) {
                    break;
                }
                return;
            case 'v':
                if (ends("ive")) {
                    break;
                }
                return;
            case 'z':
                if (ends("ize")) {
                    break;
                }
                return;
            default:
                return;
        }
        if (m() > 1) {
            k = j;
        }
    }

    /* step6() removes a final -e if m() > 1. */
    private final void step6() {
        j = k;
        if (b[k] == 'e') {
            int a = m();
            if (a > 1 || a == 1 && !cvc(k - 1)) {
                k--;
            }
        }
        if (b[k] == 'l' && doublec(k) && m() > 1) {
            k--;
        }
    }

    /** Stem the word placed into the Stemmer buffer through calls to add().
     * Returns true if the stemming process resulted in a word different
     * from the input.  You can retrieve the result with
     * getResultLength()/getResultBuffer() or toString().
     */
    public void stem() {
        k = i - 1;
        if (k > 1) {
            step1();
            step2();
            step3();
            step4();
            step5();
            step6();
        }
        i_end = k + 1;
        i = 0;
    }
    
    public void StemmerFunc(){
         char[] w = new char[501];
        Stemmer s = new Stemmer();


            //  FileOutputStream fouts=new FileOutputStream("stemmer");
            //FileInputStream in = new FileInputStream("output");


            try {
                FileReader fr = new FileReader("output");
            BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("stemm");
                while ((br.readLine())!= null) {
                    int ch = br.read();
                    if (Character.isLetter((char) ch)) {
                        int j = 0;
                        while (true) {
                            ch = Character.toLowerCase((char) ch);
                            w[j] = (char) ch;
                            if (j < 500) {
                                j++;
                            }
                            ch = br.read();
                            if (!Character.isLetter((char) ch)) {
                                /* to test add(char ch) */
                                for (int c = 0; c < j; c++) {
                                    s.add(w[c]);
                                }

                                /* or, to test add(char[] w, int j) */
                                /* s.add(w, j); */

                                s.stem();
                                {
                                    String u;

                                    /* and now, to test toString() : */
                                    u = s.toString();

                                    /* to test getResultBuffer(), getResultLength() : */
                                    /* u = new String(s.getResultBuffer(), 0, s.getResultLength()); */

                                    // System.out.print(u);
                                    for (int k = 0; k < u.length(); k++) {
                                        byte input = (byte) u.charAt(k);
                                        fw.write(input);

                                    }
                             char c='\n';
                        fw.write((byte)c);


                                }

                                break;
                            }
                        }
                    }
                    if (ch < 0) {
                        break;
                    }
                    fw.write((char) ch);
                  //  fw.write((char) ch);
                    // System.out.print((char)ch);

                }
                 fw.close();
            } catch (IOException e) {
                System.out.println("Error Reading ");

            }

        //  Stemmer util = new Stemmer();
        VocStem v = new VocStem();

        Stopwords s1 = new Stopwords();
        s1.Stopwordsfunc();
        v.VocabularysizeStem();

    }
}
class VocStem {

    public void VocabularysizeStem() {

        try {
            File file = new File("outputStem");
            FileReader fr = new FileReader(file);
            LineNumberReader ln = new LineNumberReader(fr);

            int count = 0;

            while (ln.readLine() != null) {

                count++;

            }
            System.out.print("Vocabulary Size[Number of Unique Terms] ");
            System.out.print(count + "\n");
        } catch (IOException e) {
        }


    }
}

class Voc {

    public void Vocabularysize() {

        try {
            File file = new File("output");
            FileReader fr = new FileReader(file);
            LineNumberReader ln = new LineNumberReader(fr);

            int count = 0;

            while (ln.readLine() != null) {

                count++;

            }
            System.out.print("Vocabulary Size[Number of Unique Terms] ");
            System.out.print(count+"\n");
        } catch (IOException e) {
        }


    }
}

class TopTen {

    public void TopTenRank() {

        File file = new File("rank");
        try {
            FileReader frank = new FileReader(file);
            BufferedReader br = new BufferedReader(frank);
            FileWriter fwr = new FileWriter("10Ranks");
            for (int i = 0; i < 10; i++) {
                String str = br.readLine();
                fwr.write(str + "\n");
            }
            fwr.close();
        } catch (IOException e) {
        }

    }
}

class Stopwords{
    public void Stopwordsfunc(){
    String stopwords[] ={"a",
"all",
"an",
"and",
"any",
"are",
"as",
"be",
"been",
"but",
"by",
"few",
"for",
"have",
"he",
"her",
"here",
"him",
"his",
"how",
"i",
"in",
"is",
"it",
"its",
"many",
"me",
"my",
"none",
    "from",
"of",
"on",
"or",
"our",
 "at",
  "to",
"she",
"some",
"the",
"their",
"them",
"there",
"they",
"that",
"this",
"us",
"was",
"what",
"when",
"where",
"which",
"who",
"why",
"will",
"with",
"you",
"your"

};
   //  HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
    int flag=0;
    try {





      //Construct the new file that will later be renamed to the original filename.

 FileReader fr3 = new FileReader("newfile");

      BufferedReader br3 = new BufferedReader(fr3);
      FileWriter fw3 = new FileWriter("10_MRank");

      String line = null;
int i;
      //Read from the original file and write to the new
      //unless content matches data to be removed.

   while((line = br3.readLine()) != null)
      {
          //System.out.println(line);
         // hm1.put(line, flag)
         // String key =

    for(i=0;i<stopwords.length;i++)
       {
          if ((line.equals(stopwords[i])))
          {
              flag=1;
             break;
          }
          else{
              flag=0;
          }

        }

    // i=0;
      if(flag==0){
        //   System.out.println(line);
            fw3.write(line+"\n");
       //   fw3.flush();

       }





    }
 fw3.close();
      br3.close();
}

    catch(IOException e){}
    }
void Count(){
    try{
    FileReader f = new FileReader("10_MRank");
    BufferedReader r = new BufferedReader(f);
    FileWriter fw = new FileWriter("10_M_Rank");
    for(int i=0;i<10;i++){
        String s = r.readLine();
        fw.write(s+"\n");
    }
fw.close();
    }catch(IOException e){}
}

}
   
public class Main {

    public static Map<String, Integer> frequencyMap = new TreeMap<String, Integer>();

//    public static void getMeaningCount(HashMap hm1){
//        FileReader f = new FileReader("rank");
//        BufferedReader r = new BufferedReader(f);
//        while()
//    }
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        Tok t = new Tok();
        int cnt = 0, value;
        String key;
        try {
           // FileReader frank = new FileReader("stopwords.txt");
           // BufferedReader br1 = new BufferedReader(frank);
            FileWriter fw = new FileWriter("output");
            FileWriter fw1 = new FileWriter("rank");
            FileWriter fw2 = new FileWriter("optional");
            FileWriter fwr1 = new FileWriter("10_M_Ranks");
            frequencyMap = t.Tokenize();
            Set st = frequencyMap.keySet();
            Collection c = frequencyMap.values();
            ArrayList myArrayList = new ArrayList(frequencyMap.entrySet());
            Iterator itr1 = myArrayList.iterator();
            while (itr1.hasNext()) {
                cnt++;
                Map.Entry e = (Map.Entry) itr1.next();
                key = (String) e.getKey();
                value = ((Integer) e.getValue()).intValue();
                fw.write(key + " " + value + "\n");
                hm.put(key, value);
                hm1.put(key, value);
                //getMeaningCount(hm1);
            }
            ValueComparator bvc = new ValueComparator(hm);
            TreeMap<String, Integer> sorted_map = new TreeMap(bvc);
            sorted_map.putAll(hm);
            int sum = 0;
            System.out.println("results");
            for (String key1 : sorted_map.keySet()) {
                // System.out.println("key/value: " + key1 + "/"+sorted_map.get(key1));
                fw1.write(key1 + " " + sorted_map.get(key1) + "\n");
                if (sum <= 102731) {
                    sum = sum + sorted_map.get(key1);
                    fw2.write(key1 + "\n");
                }
            }
            System.out.println("Sum " + sum);
            fw2.write("Sum " + sum + "\n");

            fw.close();
            fw1.close();
            fwr1.close();
            fw2.close();
            Voc v = new Voc();
            TopTen top = new TopTen();
            v.Vocabularysize();
            top.TopTenRank();
            Stopwords s = new Stopwords();
            s.Stopwordsfunc();
            s.Count();
            System.out.println("\nStemmer Implementation\n");
            Stemmer stem = new Stemmer();
            stem.StemmerFunc();
            Freqmain fstem = new Freqmain();
            fstem.frequencyStem();
            Stopwordsstem stemmer = new Stopwordsstem();
            stemmer.StopwordsfuncStem();
            stemmer.CountStem();
        } catch (IOException e) {
        }

    }

}

class ValueComparator implements Comparator {

    Map base;

    public ValueComparator(Map base) {
        this.base = base;
    }

    public int compare(Object a, Object b) {

        if ((Integer) base.get(a) < (Integer) base.get(b)) {
            return 1;
        } else if ((Integer) base.get(a) == (Integer) base.get(b)) {
            return 0;
        } else {
            return -1;
        }
    }
}

class Fre{
 public Map<String, Integer> frequencyMap = new TreeMap<String, Integer>();
    /**
     * @param args the command line arguments
     */
    public TreeMap Freq() {
      try{
         FileReader fr = new FileReader("stemm");
         BufferedReader b = new BufferedReader(fr);

         String res = null;
         while((res = b.readLine())!= null){
              Integer frequency = frequencyMap.get(res);
                                // Add the word if it doesn't already exist, otherwise increment the
                                // frequency counter.
                                if (frequency == null) {
                                    frequency = 0;
                                }
                                frequencyMap.put(res, frequency + 1);
                                //fw.write(res + "\n");
         }

                fr.close();
      }catch(IOException e){

      }
    return (TreeMap) (frequencyMap);
    }
}
class Freqmain{
    public static Map<String, Integer> frequencyMap = new TreeMap<String, Integer>();
public void frequencyStem(){
HashMap<String, Integer> hm = new HashMap<String, Integer>();

        Fre t = new Fre();
        int cnt = 0, value;
        String key;
try{
FileWriter fw = new FileWriter("outputStem");
            FileWriter fw1 = new FileWriter("rankStem");
             frequencyMap = t.Freq();
            Set st = frequencyMap.keySet();
            Collection c = frequencyMap.values();
            ArrayList myArrayList = new ArrayList(frequencyMap.entrySet());
            Iterator itr1 = myArrayList.iterator();
            while (itr1.hasNext()) {
                cnt++;
                Map.Entry e = (Map.Entry) itr1.next();
                key = (String) e.getKey();
                value = ((Integer) e.getValue()).intValue();
                fw.write(key + " " + value + "\n");
                hm.put(key, value);
                //getMeaningCount(hm1);
            }
              ValueComparator bvc = new ValueComparator(hm);
            TreeMap<String, Integer> sorted_map = new TreeMap(bvc);
            sorted_map.putAll(hm);
            System.out.println("Stemmer Results");
            for (String key1 : sorted_map.keySet()) {
               //  System.out.println("key/value: " + key1 + "/"+sorted_map.get(key1));
                fw1.write(key1 + " " + sorted_map.get(key1) + "\n");


            }
            fw.close();
            fw1.close();
}catch(IOException e){

}
}
}
class Stopwordsstem{
    public void StopwordsfuncStem(){
    String stopwords[] ={"a",
"all",
"an",
"and",
"any",
"are",
"as",
"be",
"been",
"but",
"by",
"few",
"for",
"have",
"he",
"her",
"here",
"him",
"his",
"how",
"i",
"in",
"is",
"it",
"its",
"many",
"me",
"my",
"none",
    "from",
"of",
"on",
"or",
"our",
 "at",
  "to",
"she",
"some",
"the",
"their",
"them",
"there",
"they",
"that",
"this",
"us",
"was",
"what",
"when",
"where",
"which",
"who",
"why",
"will",
"with",
"you",
"your"

};
   //  HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
    int flag=0;
    try {





      //Construct the new file that will later be renamed to the original filename.

 FileReader fr3 = new FileReader("rankStem");

      BufferedReader br3 = new BufferedReader(fr3);
      FileWriter fw3 = new FileWriter("rankStemMean");

      String line = null;
int i;
      //Read from the original file and write to the new
      //unless content matches data to be removed.

   while((line = br3.readLine()) != null)
      {
          //System.out.println(line);
         // hm1.put(line, flag)
         // String key =

    for(i=0;i<stopwords.length;i++)
       {
          if ((line.equals(stopwords[i])))
          {
              flag=1;
             break;
          }
          else{
              flag=0;
          }

        }

    // i=0;
      if(flag==0){
        //   System.out.println(line);
            fw3.write(line+"\n");
       //   fw3.flush();

       }





    }
 fw3.close();
      br3.close();
}

    catch(IOException e){}
    }
void CountStem(){
    try{
    FileReader f = new FileReader("rankStemMean");
    BufferedReader r = new BufferedReader(f);
    FileWriter fw = new FileWriter("10_MStem_Rank");
    for(int i=0;i<10;i++){
        String s = r.readLine();
        fw.write(s+"\n");
    }
fw.close();
    }catch(IOException e){}
}

}