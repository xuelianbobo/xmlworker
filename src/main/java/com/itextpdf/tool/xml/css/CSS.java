/*
 * $Id$
 *
 * This file is part of the iText (R) project.
 * Copyright (c) 1998-2011 1T3XT BVBA
 * Authors: Balder Van Camp, Emiel Ackermann, et al.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License version 3
 * as published by the Free Software Foundation with the addition of the
 * following permission added to Section 15 as permitted in Section 7(a):
 * FOR ANY PART OF THE COVERED WORK IN WHICH THE COPYRIGHT IS OWNED BY 1T3XT,
 * 1T3XT DISCLAIMS THE WARRANTY OF NON INFRINGEMENT OF THIRD PARTY RIGHTS.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA, 02110-1301 USA, or download the license from the following URL:
 * http://itextpdf.com/terms-of-use/
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License,
 * a covered work must retain the producer line in every PDF that is created
 * or manipulated using iText.
 *
 * You can be released from the requirements of the license by purchasing
 * a commercial license. Buying such a license is mandatory as soon as you
 * develop commercial activities involving the iText software without
 * disclosing the source code of your own applications.
 * These activities include: offering paid services to customers as an ASP,
 * serving PDFs on the fly in a web application, shipping iText with a closed
 * source product.
 *
 * For more information, please contact iText Software Corp. at this
 * address: sales@itextpdf.com
 */
package com.itextpdf.tool.xml.css;

/**
 * CSS Property-Value container.
 *
 */
public final class CSS {

	private CSS(){}
	/**
	 * Contains CSS Properties
	 *
	 */
	public static final class Property {

		private Property() {};
		public static final String BACKGROUND_IMAGE = "background-image";
		public static final String BACKGROUND_REPEAT = "background-repeat";
		public static final String BACKGROUND_ATTACHMENT = "background-attachment";
		public static final String BACKGROUND_POSITION = "background-position";
		public static final String BACKGROUND_COLOR = "background-color";
		public static final String LIST_STYLE = "list-style";
		public static final String LIST_STYLE_TYPE = "list-style-type";
		public static final String LIST_STYLE_POSITION = "list-style-position";
		public static final String LIST_STYLE_IMAGE = "list-style-image";
		public static final String MARGIN = "margin";
		public static final String TOP = "top";
		public static final String MARGIN_LEFT = "margin-left";
		public static final String MARGIN_RIGHT = "margin-right";
		public static final String MARGIN_TOP = "margin-top";
		public static final String MARGIN_BOTTOM = "margin-bottom";
		public static final String BORDER = "border";
		public static final String BORDER_WIDTH = "border-width";
		public static final String BORDER_STYLE = "border-style";
		public static final String BORDER_COLOR = "border-color";
		public static final String BORDER_TOP_WIDTH = "border-top-width";
		public static final String BORDER_BOTTOM_WIDTH = "border-bottom-width";
		public static final String BORDER_LEFT_WIDTH = "border-left-width";
		public static final String BORDER_RIGHT_WIDTH = "border-right-width";
		public static final String BORDER_TOP_COLOR = "border-top-color";
		public static final String BORDER_BOTTOM_COLOR = "border-bottom-color";
		public static final String BORDER_LEFT_COLOR = "border-left-color";
		public static final String BORDER_RIGHT_COLOR = "border-right-color";
		public static final String BORDER_TOP_STYLE = "border-top-style";
		public static final String BORDER_BOTTOM_STYLE = "border-bottom-style";
		public static final String BORDER_LEFT_STYLE = "border-left-style";
		public static final String BORDER_RIGHT_STYLE = "border-right-style";
		public static final String PADDING = "padding";
		public static final String PADDING_TOP = "padding-top";
		public static final String PADDING_BOTTOM = "padding-bottom";
		public static final String PADDING_LEFT = "padding-left";
		public static final String PADDING_RIGHT = "padding-right";
		public static final String FONT = "font";
		public static final String FONT_WEIGHT = "font-weight";
		public static final String FONT_SIZE = "font-size";
		public static final String FONT_STYLE = "font-style";
		public static final String FONT_FAMILY = "font-family";
		public static final String TEXT_DECORATION = "text-decoration";
		public static final String COLOR = "color";
		public static final String TAB_INTERVAL = "tab-interval";
		public static final String XFA_TAB_COUNT = "xfa-tab-count";
		public static final String XFA_FONT_HORIZONTAL_SCALE = "xfa-font-horizontal-scale";
		public static final String XFA_FONT_VERTICAL_SCALE = "xfa-font-vertical-scale";
		public static final String BEFORE = "before";
		public static final String AFTER = "after";
		public static final String HEIGHT = "height";
		public static final String WIDTH = "width";
		public static final String LETTER_SPACING = "letter-spacing";
		public static final String VERTICAL_ALIGN = "vertical-align";
		public static final String LINE_HEIGHT = "line-height";
		public static final String TEXT_ALIGN = "text-align";
		public static final String TEXT_INDENT = "text-indent";
		public static final String POSITION = "position";
		public static final String EMPTY_CELLS = "empty-cells";
		public static final String CELLPADDING = "cellpadding";
		public static final String CAPTION_SIDE = "caption-side";
		public static final String TAB_STOPS = "tab-stops";
		public static final String XFA_TAB_STOPS = "xfa-tab-stops";
		public static final String PAGE_BREAK_BEFORE = "page-break-before";
		public static final String PAGE_BREAK_AFTER = "page-break-after";
		public static final String REPEAT_HEADER = "repeat-header";
		public static final String REPEAT_FOOTER = "repeat-footer";
	}

	/**
	 * Contains CSS Values for properties
	 *
	 */
	public static final class Value {
		private Value(){};
		public static final String THIN = "thin";
		public static final String MEDIUM = "medium";
		public static final String THICK = "thick";
		public static final String NONE = "none";
		public static final String HIDDEN = "hidden";
		public static final String DOTTED = "dotted";
		public static final String DASHED = "dashed";
		public static final String SOLID = "solid";
		public static final String DOUBLE = "double";
		public static final String GROOVE = "groove";
		public static final String RIDGE = "ridge";
		public static final String INSET = "inset";
		public static final String OUTSET = "outset";
		public static final String LEFT = "left";
		public static final String CENTER = "center";
		public static final String JUSTIFY = "justify";
		public static final String BOTTOM = "bottom";
		public static final String TOP = "top";
		public static final String RIGHT = "right";
		public static final String REPEAT = "repeat";
		public static final String NO_REPEAT = "no-repeat";
		public static final String REPEAT_X = "repeat-x";
		public static final String REPEAT_Y = "repeat-y";
		public static final String FIXED = "fixed";
		public static final String SCROLL = "scroll";
		public static final String DISC = "disc";
		public static final String SQUARE = "square";
		public static final String CIRCLE = "circle";
		public static final String DECIMAL = "decimal";
		public static final String LOWER_ROMAN = "lower-roman";
		public static final String UPPER_ROMAN = "upper-roman";
		public static final String LOWER_GREEK = "lower-greek";
		public static final String UPPER_GREEK = "upper-greek";
		public static final String LOWER_ALPHA = "lower-alpha";
		public static final String UPPER_ALPHA = "upper-alpha";
		public static final String LOWER_LATIN = "lower-latin";
		public static final String UPPER_LATIN = "upper-latin";
		public static final String INSIDE = "inside";
		public static final String OUTSIDE = "outside";
		public static final String INHERIT = "inherit";
		public static final String UNDERLINE = "underline";
		public static final String BOLD = "bold";
		public static final String ITALIC = "italic";
		public static final String OBLIQUE = "oblique";
		public static final String SUPER = "super";
		public static final String SUB = "sub";
		public static final String TEXT_TOP = "text-top";
		public static final String TEXT_BOTTOM = "text-bottom";
		public static final String LINE_THROUGH = "line-through";
		public static final String RELATIVE = "relative";
		public static final String HIDE = "hide";
		public static final String XX_SMALL = "xx-small";
		public static final String X_SMALL = "x-small";
		public static final String SMALL = "small";
		public static final String LARGE = "large";
		public static final String X_LARGE = "x-large";
		public static final String XX_LARGE = "xx-large";
		public static final String SMALLER = "smaller";
		public static final String LARGER = "larger";
		public static final String PX = "px";
		public static final String IN = "in";
		public static final String CM = "cm";
		public static final String MM = "mm";
		public static final String PT = "pt";
		public static final String PC = "pc";
		public static final String PERCENTAGE = "%";
		public static final String EM = "em";
		public static final String EX = "ex";
		public static final String ALWAYS = "always";
	}
}
