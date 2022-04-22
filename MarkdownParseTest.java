import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;




public class MarkdownParseTest {
    @Test
    public void adddition(){
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException{


        MarkdownParse test = new MarkdownParse();


        Path fileName = Path.of("/Users/brandonluu/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = test.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();
        result.add("https://something.com");
        result.add("some-thing.html");


        assertEquals(result, links);

    }

    @Test
    public void testGetLinks2() throws IOException{


        MarkdownParse test = new MarkdownParse();


        Path fileName = Path.of("/Users/brandonluu/Documents/GitHub/markdown-parser/test2-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = test.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();
        

        assertEquals(result, links);

    }

    @Test
    public void testGetLinks3() throws IOException{


        MarkdownParse test = new MarkdownParse();


        Path fileName = Path.of("/Users/brandonluu/Documents/GitHub/markdown-parser/test3-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = test.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();
        result.add("https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Google_Images_2015_logo.svg/800px-Google_Images_2015_logo.svg.png");

        assertEquals(result, links);

    }
    

    @Test
    public void testGetLinks4() throws IOException{


        MarkdownParse test = new MarkdownParse();


        Path fileName = Path.of("/Users/brandonluu/Documents/GitHub/markdown-parser/test4-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = test.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();
        result.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule?authuser=0");



        assertEquals(result, links);

    }


    @Test
    public void testGetLinks5() throws IOException{


        MarkdownParse test = new MarkdownParse();


        Path fileName = Path.of("/Users/brandonluu/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = test.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();
        result.add("https://something.com");
        result.add("some-page.html");



        assertEquals(result, links);

    }

    @Test
    public void testGetLinks6() throws IOException{


        MarkdownParse test = new MarkdownParse();


        Path fileName = Path.of("/Users/brandonluu/Documents/GitHub/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = test.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();


        assertEquals(result, links);

    }    

    @Test
    public void testGetLinks7() throws IOException{


        MarkdownParse test = new MarkdownParse();


        Path fileName = Path.of("/Users/brandonluu/Documents/GitHub/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = test.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();


        assertEquals(result, links);

    }    

    @Test
    public void testGetLinks8() throws IOException{


        MarkdownParse test = new MarkdownParse();


        Path fileName = Path.of("/Users/brandonluu/Documents/GitHub/markdown-parser/test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = test.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();


        assertEquals(result, links);

    }    

    @Test
    public void testGetLinks9() throws IOException{


        MarkdownParse test = new MarkdownParse();


        Path fileName = Path.of("/Users/brandonluu/Documents/GitHub/markdown-parser/test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = test.getLinks(content);

        ArrayList<String> result = new ArrayList<String>();
        result.add("a link on the first line");


        assertEquals(result, links);

    }    
    







}


