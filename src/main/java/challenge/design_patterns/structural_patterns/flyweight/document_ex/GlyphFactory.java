package challenge.design_patterns.structural_patterns.flyweight.document_ex;

import java.util.HashMap;
import java.util.Map;

public class GlyphFactory {
	private static volatile GlyphFactory instance;
	private Map<String, Glyph> glyphPool = new HashMap<String, Glyph>();

	public static GlyphFactory getInstance() {
		if (instance == null) {
			synchronized (GlyphFactory.class) {
				if (instance == null) {
					return new GlyphFactory();
				}
			}
		}

		return instance;
	}

	public Glyph getGlyph(String key) {
		if (glyphPool.containsKey(key)) {
			return glyphPool.get(key);

		} else {
			Glyph f = new Character(key.charAt(0));
			glyphPool.put(key, f);

			return f;
		}
	}
}
