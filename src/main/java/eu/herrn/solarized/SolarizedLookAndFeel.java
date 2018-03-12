/*
 */

package eu.herrn.solarized;

import java.util.logging.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

/**
 *
 * @author mherrn
 */
public class SolarizedLookAndFeel extends MetalLookAndFeel {
  private static final Logger LOGGER= Logger.getLogger(SolarizedLookAndFeel.class.getName());

  /////////////////////////////////////////////////////////////////////////////
  //
  // Attributes

  /////////////////////////////////////////////////////////////////////////////
  //
  // Constructors

  /////////////////////////////////////////////////////////////////////////////
  //
  // Methods

  @Override
  public String getName() {
    return "Solarized";
  }

  @Override
  protected void createDefaultTheme() {
    super.createDefaultTheme();
    if ( !(getCurrentTheme() instanceof SolarizedTheme) ) {
      setCurrentTheme( new SolarizedTheme() );
    }
  }
}
