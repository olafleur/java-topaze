// Generated from C:/Users/Olivier/topaze/src/main/antlr4/com.olivierlafleur.topaze\Topaze.g4 by ANTLR 4.5
package com.olivierlafleur.topaze;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TopazeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Nom=3, WS=4, Int=5;
	public static final int
		RULE_topaze = 0;
	public static final String[] ruleNames = {
		"topaze"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'vaut'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Nom", "WS", "Int"
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

	@Override
	public String getGrammarFileName() { return "Topaze.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TopazeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TopazeContext extends ParserRuleContext {
		public Token nom;
		public Token valeur;
		public List<TerminalNode> WS() { return getTokens(TopazeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TopazeParser.WS, i);
		}
		public TerminalNode Nom() { return getToken(TopazeParser.Nom, 0); }
		public TerminalNode Int() { return getToken(TopazeParser.Int, 0); }
		public TopazeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topaze; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).enterTopaze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).exitTopaze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TopazeVisitor ) return ((TopazeVisitor<? extends T>)visitor).visitTopaze(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopazeContext topaze() throws RecognitionException {
		TopazeContext _localctx = new TopazeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_topaze);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); 
			((TopazeContext)_localctx).nom = match(Nom);
			setState(3); 
			match(WS);
			setState(4); 
			match(T__0);
			setState(5); 
			match(WS);
			setState(6); 
			((TopazeContext)_localctx).valeur = match(Int);
			setState(7); 
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\f\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\n\2\4\3\2\2\2\4\5\7\5\2\2\5\6\7"+
		"\6\2\2\6\7\7\3\2\2\7\b\7\6\2\2\b\t\7\7\2\2\t\n\7\4\2\2\n\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}