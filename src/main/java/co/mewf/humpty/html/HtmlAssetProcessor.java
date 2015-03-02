package co.mewf.humpty.html;

import co.mewf.humpty.config.PreProcessorContext;
import co.mewf.humpty.spi.processors.AssetProcessor;

import com.googlecode.htmlcompressor.compressor.HtmlCompressor;

public class HtmlAssetProcessor implements AssetProcessor {
  
  private final HtmlCompressor compressor = new HtmlCompressor();
  
  @Override
  public String getName() {
    return "html";
  }

  @Override
  public boolean accepts(String assetName) {
    return assetName.endsWith(".html");
  }

  @Override
  public String processAsset(String assetName, String asset, PreProcessorContext context) {
    return compressor.compress(asset);
  }
}
