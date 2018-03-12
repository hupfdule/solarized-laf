/*
 * Copyright (c) 2003, 2006, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
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
}
