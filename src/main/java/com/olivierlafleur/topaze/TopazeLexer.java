// Generated from C:/Users/prof/topaze/src/main/antlr4/com.olivierlafleur.topaze\Topaze.g4 by ANTLR 4.5
package com.olivierlafleur.topaze;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TopazeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ChaineEntreParentheses=4, NomVariable=5, WS=6, 
		Int=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "ChaineEntreParentheses", "NomVariable", "WS", 
		"Int"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'afficher'", "'.'", "'vaut'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ChaineEntreParentheses", "NomVariable", "WS", 
		"Int"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TopazeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Topaze.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t;\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5&\n\5\f\5"+
		"\16\5)\13\5\3\5\3\5\3\6\6\6.\n\6\r\6\16\6/\3\7\6\7\63\n\7\r\7\16\7\64"+
		"\3\b\6\b8\n\b\r\b\16\b9\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\5\3\2"+
		"$$\4\2C\\c|\4\2\13\13\"\"?\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\32\3\2\2\2\7"+
		"\34\3\2\2\2\t!\3\2\2\2\13-\3\2\2\2\r\62\3\2\2\2\17\67\3\2\2\2\21\22\7"+
		"c\2\2\22\23\7h\2\2\23\24\7h\2\2\24\25\7k\2\2\25\26\7e\2\2\26\27\7j\2\2"+
		"\27\30\7g\2\2\30\31\7t\2\2\31\4\3\2\2\2\32\33\7\60\2\2\33\6\3\2\2\2\34"+
		"\35\7x\2\2\35\36\7c\2\2\36\37\7w\2\2\37 \7v\2\2 \b\3\2\2\2!\'\7$\2\2\""+
		"#\7$\2\2#&\7$\2\2$&\n\2\2\2%\"\3\2\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2"+
		"\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7$\2\2+\n\3\2\2\2,.\t\3\2\2-,\3\2\2"+
		"\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\f\3\2\2\2\61\63\t\4\2\2\62\61\3"+
		"\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\16\3\2\2\2\668\4\62"+
		";\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\20\3\2\2\2\b\2%\'/"+
		"\649\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}