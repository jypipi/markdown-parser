import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class TestForReport4 {
    // For my implementation

    @Test
    public void checkSnippet1() throws IOException {
        Path file = Path.of("C:\\Users\\Jeffrey Chen\\Documents\\GitHub\\markdown-parser\\LabReport4-Snippet-1.md");
        String content = Files.readString(file);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> result = new ArrayList<String>(
            Arrays.asList("`google.com", "google.com", "ucsd.edu"));

        assertEquals(3, links.size());
        assertEquals("`google.com", links.get(0));
        assertEquals("google.com", links.get(1));
        assertEquals("ucsd.edu", links.get(2));
    }

    @Test
    public void checkSnippet2() throws IOException {
        Path file = Path.of("C:\\Users\\Jeffrey Chen\\Documents\\GitHub\\markdown-parser\\LabReport4-Snippet-2.md");
        String content = Files.readString(file);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> result = new ArrayList<String>(
            Arrays.asList("a.com", "a.com(())", "example.com"));

        assertEquals(3, links.size());
        assertEquals("a.com", links.get(0));
        assertEquals("a.com(())", links.get(1));
        assertEquals("example.com", links.get(2));
    }

    @Test
    public void checkSnippet3() throws IOException {
        Path file = Path.of("C:\\Users\\Jeffrey Chen\\Documents\\GitHub\\markdown-parser\\LabReport4-Snippet-3.md");
        String content = Files.readString(file);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> result = new ArrayList<String>(Arrays.asList());

        assertEquals(0, links.size());
    }

    // For reviewed repo's implementation
    
    @Test
    public void checkReviewedSnippet1() throws IOException {
        Path file = Path.of("C:\\Users\\Jeffrey Chen\\Documents\\GitHub\\markdown-parser\\LabReport4-Snippet-1.md");
        String content = Files.readString(file);

        // Call getLinks() of the reviewed repo's MarkdownParse file
        ArrayList<String> links = reviewedMarkdownParse.getLinks(content);
        ArrayList<String> result = new ArrayList<String>(
            Arrays.asList("`google.com", "google.com", "ucsd.edu"));

        assertEquals(3, links.size());
        assertEquals("`google.com", links.get(0));
        assertEquals("google.com", links.get(1));
        assertEquals("ucsd.edu", links.get(2));
    }

    @Test
    public void checkReviewedSnippet2() throws IOException {
        Path file = Path.of("C:\\Users\\Jeffrey Chen\\Documents\\GitHub\\markdown-parser\\LabReport4-Snippet-2.md");
        String content = Files.readString(file);

        // Call getLinks() of the reviewed repo's MarkdownParse file
        ArrayList<String> links = reviewedMarkdownParse.getLinks(content);
        ArrayList<String> result = new ArrayList<String>(
            Arrays.asList("a.com", "a.com(())", "example.com"));

        assertEquals(3, links.size());
        assertEquals("a.com", links.get(0));
        assertEquals("a.com(())", links.get(1));
        assertEquals("example.com", links.get(2));
    }

    @Test
    public void checkReviewedSnippet3() throws IOException {
        Path file = Path.of("C:\\Users\\Jeffrey Chen\\Documents\\GitHub\\markdown-parser\\LabReport4-Snippet-3.md");
        String content = Files.readString(file);

        // Call getLinks() of the reviewed repo's MarkdownParse file
        ArrayList<String> links = reviewedMarkdownParse.getLinks(content);
        ArrayList<String> result = new ArrayList<String>(Arrays.asList());

        assertEquals(0, links.size());
    }
}
