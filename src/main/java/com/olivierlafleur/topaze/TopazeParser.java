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
		RULE_initialisation = 4;
	public static final String[] ruleNames = {
		"parse", "block", "instruction", "affichage", "initialisation"
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
			setState(10); 
			block();
			setState(11); 
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
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==NomVariable) {
				{
				{
				setState(13); 
				instruction();
				}
				}
				setState(18);
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
		public InitialisationContext initialisation() {
			return getRuleContext(InitialisationContext.class,0);
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
			setState(21);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(19); 
				affichage();
				}
				break;
			case NomVariable:
				enterOuterAlt(_localctx, 2);
				{
				setState(20); 
				initialisation();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(23); 
			match(T__0);
			setState(24); 
			match(WS);
			setState(25); 
			((AffichageContext)_localctx).texte = match(ChaineEntreParentheses);
			setState(29);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(26); 
				match(T__1);
				}
				break;
			case WS:
				{
				setState(27); 
				match(WS);
				setState(28); 
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

	public static class InitialisationContext extends ParserRuleContext {
		public Token nom;
		public Token valeur;
		public List<TerminalNode> WS() { return getTokens(TopazeParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TopazeParser.WS, i);
		}
		public TerminalNode NomVariable() { return getToken(TopazeParser.NomVariable, 0); }
		public TerminalNode Int() { return getToken(TopazeParser.Int, 0); }
		public InitialisationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialisation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).enterInitialisation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TopazeListener ) ((TopazeListener)listener).exitInitialisation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TopazeVisitor ) return ((TopazeVisitor<? extends T>)visitor).visitInitialisation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialisationContext initialisation() throws RecognitionException {
		InitialisationContext _localctx = new InitialisationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_initialisation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			((InitialisationContext)_localctx).nom = match(NomVariable);
			setState(32); 
			match(WS);
			setState(33); 
			match(T__2);
			setState(34); 
			match(WS);
			setState(35); 
			((InitialisationContext)_localctx).valeur = match(Int);
			setState(39);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(36); 
				match(T__1);
				}
				break;
			case WS:
				{
				setState(37); 
				match(WS);
				setState(38); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\7\3\21\n\3\f\3\16\3\24\13\3"+
		"\3\4\3\4\5\4\30\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5 \n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6*\n\6\3\6\2\2\7\2\4\6\b\n\2\2*\2\f\3\2\2\2\4\22\3\2"+
		"\2\2\6\27\3\2\2\2\b\31\3\2\2\2\n!\3\2\2\2\f\r\5\4\3\2\r\16\7\2\2\3\16"+
		"\3\3\2\2\2\17\21\5\6\4\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22"+
		"\23\3\2\2\2\23\5\3\2\2\2\24\22\3\2\2\2\25\30\5\b\5\2\26\30\5\n\6\2\27"+
		"\25\3\2\2\2\27\26\3\2\2\2\30\7\3\2\2\2\31\32\7\3\2\2\32\33\7\b\2\2\33"+
		"\37\7\6\2\2\34 \7\4\2\2\35\36\7\b\2\2\36 \7\4\2\2\37\34\3\2\2\2\37\35"+
		"\3\2\2\2 \t\3\2\2\2!\"\7\7\2\2\"#\7\b\2\2#$\7\5\2\2$%\7\b\2\2%)\7\t\2"+
		"\2&*\7\4\2\2\'(\7\b\2\2(*\7\4\2\2)&\3\2\2\2)\'\3\2\2\2*\13\3\2\2\2\6\22"+
		"\27\37)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}