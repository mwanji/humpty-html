package co.mewf.humpty.html;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.junit.Assert.assertEquals;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

import co.mewf.humpty.config.HumptyBootstrap;

public class HtmlAssetProcessorTest {

  @Test
  public void should_minify_html() throws Exception {
    String output = new HumptyBootstrap().createPipeline().process("input.html").getAsset();
    
    String expected = new String(Files.readAllBytes(Paths.get("src", "test", "resources", "HtmlAssetProcessorTest", "input_compressed.html")), UTF_8);
    
    assertEquals(expected, output);
  }
}
