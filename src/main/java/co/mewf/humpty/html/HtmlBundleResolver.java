package co.mewf.humpty.html;

import static java.util.Arrays.asList;
import co.mewf.humpty.config.Bundle;
import co.mewf.humpty.spi.bundles.BundleResolver;

public class HtmlBundleResolver implements BundleResolver {

  @Override
  public String getName() {
    return "html";
  }

  @Override
  public boolean accepts(String bundleName) {
    return bundleName.endsWith(".html");
  }

  @Override
  public Bundle resolve(String bundleName) {
    return new Bundle(bundleName, asList(bundleName));
  }
}
