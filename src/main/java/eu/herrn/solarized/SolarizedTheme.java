/*
 */

package eu.herrn.solarized;

import java.awt.Color;
import java.awt.Font;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.MetalTheme;

/**
 * The default theme for the {@code MetalLookAndFeel}.
 * <p>
 * The designers
 * of the Metal Look and Feel strive to keep the default look up to
 * date, possibly through the use of new themes in the future.
 * Therefore, developers should only use this class directly when they
 * wish to customize the "Ocean" look, or force it to be the current
 * theme, regardless of future updates.

 * <p>
 * All colors returned by {@code SolarizedTheme} are completely
 * opaque.
 *
 * @since 1.5
 * @see MetalLookAndFeel#setCurrentTheme
 */
public class SolarizedTheme extends MetalTheme {
    // Background Tones
    private final ColorUIResource base03 = new ColorUIResource( 0, 43, 54 );
    private final ColorUIResource base02 = new ColorUIResource( 7, 54, 66);

    // Content Tones
    private final ColorUIResource base01 = new ColorUIResource( 88, 110, 117 );
    private final ColorUIResource base00 = new ColorUIResource( 101, 123, 131 );
    private final ColorUIResource base0 = new ColorUIResource( 131, 148, 150 );
    private final ColorUIResource base1 = new ColorUIResource( 147, 161, 161 );

    // Background Tones
    private final ColorUIResource base2 = new ColorUIResource( 238, 232, 213 );
    private final ColorUIResource base3 = new ColorUIResource( 253, 246, 227 );

    // Accent Colors
    private final ColorUIResource yellow = new ColorUIResource( 181, 137, 0 );
    private final ColorUIResource orange = new ColorUIResource( 203, 75, 22 );
    private final ColorUIResource red = new ColorUIResource( 220, 50, 47 );
    private final ColorUIResource magenta = new ColorUIResource( 211, 54, 130 );
    private final ColorUIResource violet = new ColorUIResource( 108, 113, 196 );
    private final ColorUIResource blue = new ColorUIResource( 38, 139, 210 );
    private final ColorUIResource cyan = new ColorUIResource( 42, 161, 152 );
    private final ColorUIResource green = new ColorUIResource( 133, 153, 0 );

    private final static FontUIResource DEFAULT_FONT = new FontUIResource("Dialog", Font.PLAIN, 11); //NOI18N

  @Override
  public String getName() {
    return "Solarized";
  }


  @Override
  protected ColorUIResource getPrimary1() {
    // used for
    //  - one side of separators
    //  - folder icons tab
    //  - border of internal frame
    //  - some knobs contrast
    //  - border around expanded menu
    return base01;
  }


  @Override
  protected ColorUIResource getPrimary2() {
    // used for
    //  - selected menu entry
    //  - selected entry in combo box
    //  - active slider
    //  - border around caption on focused component
    return base00;
  }


  @Override
  protected ColorUIResource getPrimary3() {
    // used for
    //  - base color of folder icons
    //  - lines in Jtree
    //  - tooltip background
    return base0;
  }


  @Override
  protected ColorUIResource getSecondary1() {
    // used for:
    //  - borders (or border shadows)
    //  - ripple effect in tab bars and internal frames
    return base00;
  }


  @Override
  protected ColorUIResource getSecondary2() {
    // used for:
    //  - deactivated tabs
    //  - border between menu bar and main panel
    //  - part of border of sliders
    //  - grid lines in tables
    //  - activated toggle buttons
    //  - pressed down buttons
    return base0;
  }


  @Override
  protected ColorUIResource getSecondary3() {
    // used for:
    //  - panel background
    //  - active elements (activated tabs, buttons, table headers
    return base1;
  }


  @Override
  public ColorUIResource getWindowBackground() {
    // used for:
    //  - background of
    //    - tables
    //    - trees
    //    - text fields
    //    - text areas
    return base3;
  }


  @Override
  public ColorUIResource getControl() {
    // used for:
    //  - panels
    //  - buttons
    //  - activated tabs
    //  - table headers
    return base2;
  }


  @Override
  public ColorUIResource getControlDisabled() {
    // used for:
    //  - caption of disabled elements
    return super.getControlDisabled();
  }


  @Override
  public ColorUIResource getControlTextColor() {
    // used for:
    //  - text on controls (but not in trees, lists, but also in tables)
    return base02;
  }


  @Override
  public ColorUIResource getControlHighlight() {
    // used for:
    //  - shadowed borders (sun on upper left)
    //  - slider handle
    return super.getControlHighlight();
  }


  @Override
  public ColorUIResource getControlInfo() {
    // used for:
    //  - Dropdown-Button in ComboBox
    //  - upper part of Slider component
    return this.getControlTextColor();
  }


  @Override
  public ColorUIResource getControlDarkShadow() {
    // used for:
    //  - lightened borders (sun on upper left)
    //  - border around selected menu
    return base1;
  }


  @Override
  public ColorUIResource getControlShadow() {
    // used for:
    //  - inactive tabs
    //  - pressed buttons
    //  - table grid lines
    //  - separator between menu and main panel
    //  - border of disabled elements
    return new ColorUIResource(slightlyDarker(getControl()));
  }


  @Override
  public ColorUIResource getFocusColor() {
    // used for:
    //  - border around text on focused element
    return base1;
  }


  @Override
  public ColorUIResource getMenuDisabledForeground() {
    return this.getControlDisabled();
  }


  @Override
  public ColorUIResource getMenuSelectedForeground() {
   return new ColorUIResource(this.getControl().brighter());
  }


  @Override
  public ColorUIResource getMenuSelectedBackground() {
    return this.getControlShadow();
  }


  @Override
  public ColorUIResource getMenuForeground() {
    return this.getControlTextColor();
  }


  @Override
  public ColorUIResource getMenuBackground() {
    return this.getControl();
  }


  @Override
  public ColorUIResource getHighlightedTextColor() {
    // used for:
    //  - hightlighted text in tables, tree, lists, textfields, textareads, but NOT in combo box list!
    return base2;
  }


  @Override
  public ColorUIResource getUserTextColor() {
    // used for:
    //  - text in textfield, textarea, trees, lists
    return this.getControlTextColor();
  }


  @Override
  public ColorUIResource getInactiveControlTextColor() {
    return base1;
  }


  @Override
  public ColorUIResource getSystemTextColor() {
    // used for:
    //  - normal label text
    //  FIXME: What about titles?
    return this.getControlTextColor();
  }


  @Override
  public ColorUIResource getWindowTitleInactiveForeground() {
    return base01;
  }


  @Override
  public ColorUIResource getWindowTitleInactiveBackground() {
    return this.getControl();
  }


  @Override
  public ColorUIResource getWindowTitleForeground() {
    return base3;
  }


  @Override
  public ColorUIResource getWindowTitleBackground() {
    return base1;
  }


  @Override
  public ColorUIResource getPrimaryControlDarkShadow() {
    return base1;
  }


  @Override
  public ColorUIResource getPrimaryControlShadow() {
    return base2;
  }


  @Override
  public ColorUIResource getPrimaryControlInfo() {
    // used for:
    //  - tooltip text
    return base02;
  }


  @Override
  public ColorUIResource getPrimaryControl() {
    // used for:
    //  - tooltip background
    //  - icons in trees
    return new ColorUIResource(slightlyDarker(base3));
  }






  @Override
  public FontUIResource getControlTextFont() {
    return DEFAULT_FONT;
  }


  @Override
  public FontUIResource getSystemTextFont() {
    return DEFAULT_FONT;
  }


  @Override
  public FontUIResource getUserTextFont() {
    return DEFAULT_FONT;
  }


  @Override
  public FontUIResource getMenuTextFont() {
    return DEFAULT_FONT;
  }


  @Override
  public FontUIResource getWindowTitleFont() {
    return DEFAULT_FONT;
  }


  @Override
  public FontUIResource getSubTextFont() {
    return DEFAULT_FONT;
  }


  public Color slightlyDarker(final Color c) {
    final float factor= 0.85f;
        return new Color(Math.max((int)(c.getRed()  *factor), 0),
                         Math.max((int)(c.getGreen()*factor), 0),
                         Math.max((int)(c.getBlue() *factor), 0),
                         c.getAlpha());
    }
}
