// Generated from C:/Users/prof/topaze/src/main/antlr4/com.olivierlafleur.topaze\Topaze.g4 by ANTLR 4.5
package com.olivierlafleur.topaze;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TopazeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ChaineEntreParentheses=4, NomVariable=5, WS=6, 
		Int=7;
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_instruction = 2, RULE_affichage = 3, 
		RULE_initialisation_chaine = 4, RULE_initialisation_entier = 5;
	public static final String[] ruleNames = {
		"parse", "block", "instruction", "affichage", "initialisation_chaine", 
		"initialisation_entier"
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
	public static class ParseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TopazeParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TopazeVisitor ) return ((TopazeVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); 
			block();
			setState(13); 
			match(EOF);
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

	public static class BlockContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TopazeVisitor ) return ((TopazeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==NomVariable) {
				{
				{
				setState(15); 
				instruction();
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class InstructionContext extends ParserRuleContext {
		public AffichageContext affichage() {
			return getRuleContext(AffichageContext.class,0);
		}
		public Initialisation_chaineContext initialisation_chaine() {
			return getRuleContext(Initialisation_chaineContext.class,0);
		}
		public Initialisation_entierContext initialisation_entier() {
			return getRuleContext(Initialisation_entierContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TopazeVisitor ) return ((TopazeVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21); 
				affichage();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22); 
				initialisation_chaine();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(23); 
				initialisation_entier();
				}
				break;
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

	public static class AffichageContext extends ParserRuleContext {
		public Token texte;
		public List<TerminalNode> WS() { return getTokens(TopazeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TopazeParser.WS, i);
		}
		public TerminalNode ChaineEntreParentheses() { return getToken(TopazeParser.ChaineEntreParentheses, 0); }
		public AffichageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affichage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).enterAffichage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).exitAffichage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TopazeVisitor ) return ((TopazeVisitor<? extends T>)visitor).visitAffichage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AffichageContext affichage() throws RecognitionException {
		AffichageContext _localctx = new AffichageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_affichage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			match(T__0);
			setState(27); 
			match(WS);
			setState(28); 
			((AffichageContext)_localctx).texte = match(ChaineEntreParentheses);
			setState(32);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(29); 
				match(T__1);
				}
				break;
			case WS:
				{
				setState(30); 
				match(WS);
				setState(31); 
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Initialisation_chaineContext extends ParserRuleContext {
		public Token nom;
		public Token texte;
		public List<TerminalNode> WS() { return getTokens(TopazeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TopazeParser.WS, i);
		}
		public TerminalNode NomVariable() { return getToken(TopazeParser.NomVariable, 0); }
		public TerminalNode ChaineEntreParentheses() { return getToken(TopazeParser.ChaineEntreParentheses, 0); }
		public Initialisation_chaineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialisation_chaine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).enterInitialisation_chaine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).exitInitialisation_chaine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TopazeVisitor ) return ((TopazeVisitor<? extends T>)visitor).visitInitialisation_chaine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialisation_chaineContext initialisation_chaine() throws RecognitionException {
		Initialisation_chaineContext _localctx = new Initialisation_chaineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initialisation_chaine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			((Initialisation_chaineContext)_localctx).nom = match(NomVariable);
			setState(35); 
			match(WS);
			setState(36); 
			match(T__2);
			setState(37); 
			match(WS);
			setState(38); 
			((Initialisation_chaineContext)_localctx).texte = match(ChaineEntreParentheses);
			setState(42);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(39); 
				match(T__1);
				}
				break;
			case WS:
				{
				setState(40); 
				match(WS);
				setState(41); 
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Initialisation_entierContext extends ParserRuleContext {
		public Token nom;
		public Token valeur;
		public List<TerminalNode> WS() { return getTokens(TopazeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TopazeParser.WS, i);
		}
		public TerminalNode NomVariable() { return getToken(TopazeParser.NomVariable, 0); }
		public TerminalNode Int() { return getToken(TopazeParser.Int, 0); }
		public Initialisation_entierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialisation_entier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).enterInitialisation_entier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).exitInitialisation_entier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TopazeVisitor ) return ((TopazeVisitor<? extends T>)visitor).visitInitialisation_entier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialisation_entierContext initialisation_entier() throws RecognitionException {
		Initialisation_entierContext _localctx = new Initialisation_entierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initialisation_entier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			((Initialisation_entierContext)_localctx).nom = match(NomVariable);
			setState(45); 
			match(WS);
			setState(46); 
			match(T__2);
			setState(47); 
			match(WS);
			setState(48); 
			((Initialisation_entierContext)_localctx).valeur = match(Int);
			setState(52);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(49); 
				match(T__1);
				}
				break;
			case WS:
				{
				setState(50); 
				match(WS);
				setState(51); 
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t9\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\7\3\23\n\3\f\3\16\3"+
		"\26\13\3\3\4\3\4\3\4\5\4\33\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5#\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6-\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\67\n\7\3\7\2\2\b\2\4\6\b\n\f\2\28\2\16\3\2\2\2\4\24\3\2\2\2\6\32\3"+
		"\2\2\2\b\34\3\2\2\2\n$\3\2\2\2\f.\3\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3"+
		"\20\3\3\2\2\2\21\23\5\6\4\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2"+
		"\24\25\3\2\2\2\25\5\3\2\2\2\26\24\3\2\2\2\27\33\5\b\5\2\30\33\5\n\6\2"+
		"\31\33\5\f\7\2\32\27\3\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33\7\3\2\2\2"+
		"\34\35\7\3\2\2\35\36\7\b\2\2\36\"\7\6\2\2\37#\7\4\2\2 !\7\b\2\2!#\7\4"+
		"\2\2\"\37\3\2\2\2\" \3\2\2\2#\t\3\2\2\2$%\7\7\2\2%&\7\b\2\2&\'\7\5\2\2"+
		"\'(\7\b\2\2(,\7\6\2\2)-\7\4\2\2*+\7\b\2\2+-\7\4\2\2,)\3\2\2\2,*\3\2\2"+
		"\2-\13\3\2\2\2./\7\7\2\2/\60\7\b\2\2\60\61\7\5\2\2\61\62\7\b\2\2\62\66"+
		"\7\t\2\2\63\67\7\4\2\2\64\65\7\b\2\2\65\67\7\4\2\2\66\63\3\2\2\2\66\64"+
		"\3\2\2\2\67\r\3\2\2\2\7\24\32\",\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}