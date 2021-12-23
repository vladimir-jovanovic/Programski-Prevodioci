// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/spec.flex

import java_cup.runtime.*;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class MPLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2, 2
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\1\1\0"+
    "\1\5\5\0\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\0\1\15\11\16\1\17\1\20\1\21\1\22"+
    "\1\23\21\0\1\24\6\0\1\25\3\0\1\26\1\27"+
    "\1\30\3\0\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\2\40\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\2\40\1\54"+
    "\2\40\1\55\1\0\1\56\1\57\6\0\1\3\u01a2\0"+
    "\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\2\1\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\1\1\17\1\20\11\21\1\22\1\23\1\1\2\24"+
    "\1\2\1\25\1\26\1\27\2\0\1\30\1\0\1\31"+
    "\1\21\1\32\1\21\1\33\1\34\1\21\1\35\4\21"+
    "\3\0\1\36\1\37\1\40\1\41\1\11\3\21\1\42"+
    "\4\21\3\0\3\21\1\43\1\44\2\21\4\0\3\21"+
    "\1\45\2\21\2\0\1\46\1\0\1\47\3\21\1\50"+
    "\3\0\3\21\3\0\3\21\3\0\1\51\2\21\3\0"+
    "\1\52\1\21\1\53\2\0\1\21\1\54\1\0\1\55"+
    "\1\0\1\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\220\0\300\0\220\0\220"+
    "\0\220\0\220\0\360\0\220\0\u0120\0\u0150\0\u0180\0\220"+
    "\0\220\0\220\0\220\0\220\0\u01b0\0\220\0\220\0\u01e0"+
    "\0\u0210\0\u0240\0\u0270\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360"+
    "\0\220\0\220\0\u0390\0\220\0\u03c0\0\u03f0\0\u0420\0\220"+
    "\0\u0450\0\u0150\0\u0480\0\220\0\u04b0\0\220\0\u04e0\0\u01e0"+
    "\0\u0510\0\u01e0\0\u01e0\0\u0540\0\u01e0\0\u0570\0\u05a0\0\u05d0"+
    "\0\u0600\0\u0630\0\u0660\0\u0690\0\220\0\220\0\220\0\220"+
    "\0\u04b0\0\u06c0\0\u06f0\0\u0720\0\u01e0\0\u0750\0\u0780\0\u07b0"+
    "\0\u07e0\0\u0810\0\u0840\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u01e0"+
    "\0\u0930\0\u0960\0\u0990\0\u09c0\0\u09f0\0\u0a20\0\u0a50\0\u0a80"+
    "\0\u0ab0\0\u0ae0\0\u01e0\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\220"+
    "\0\u0bd0\0\u01e0\0\u0c00\0\u0c30\0\u0c60\0\u01e0\0\u0c90\0\u0cc0"+
    "\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u0de0\0\u0e10\0\u0e40"+
    "\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\u01e0\0\u0f60\0\u0f90"+
    "\0\u0fc0\0\u0ff0\0\u1020\0\u01e0\0\u1050\0\220\0\u1080\0\u10b0"+
    "\0\u10e0\0\220\0\u1110\0\u01e0\0\u1140\0\220";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\2\5\1\0\1\6\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\4\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\4\1\25\1\26\1\4\1\27"+
    "\3\30\1\31\1\32\1\30\1\33\1\30\1\34\1\35"+
    "\1\30\1\36\3\30\1\37\1\40\3\30\1\41\1\42"+
    "\1\43\2\5\1\44\1\0\1\45\6\5\1\46\44\5"+
    "\2\47\1\44\1\47\1\45\1\50\21\47\1\51\30\47"+
    "\62\0\1\5\72\0\1\52\1\53\54\0\1\54\1\0"+
    "\1\52\1\53\55\0\1\55\57\0\1\55\2\17\65\0"+
    "\1\56\50\0\2\30\12\0\24\30\20\0\2\30\12\0"+
    "\14\30\1\57\7\30\20\0\2\30\12\0\16\30\1\60"+
    "\4\30\1\61\20\0\2\30\12\0\21\30\1\62\2\30"+
    "\20\0\2\30\12\0\5\30\1\63\5\30\1\64\10\30"+
    "\20\0\2\30\12\0\21\30\1\65\2\30\20\0\2\30"+
    "\12\0\1\66\13\30\1\67\7\30\20\0\2\30\12\0"+
    "\4\30\1\70\17\30\20\0\2\30\12\0\21\30\1\71"+
    "\2\30\40\0\1\72\6\0\1\73\3\0\1\74\11\0"+
    "\1\44\70\0\1\75\44\0\2\47\1\0\1\47\2\0"+
    "\21\47\1\0\30\47\5\0\1\76\36\0\1\44\3\0"+
    "\1\77\1\0\1\100\21\0\1\55\2\53\56\0\2\101"+
    "\56\0\2\30\12\0\22\30\1\102\1\30\20\0\2\30"+
    "\12\0\4\30\1\103\10\30\1\104\6\30\20\0\2\30"+
    "\12\0\21\30\1\105\2\30\20\0\2\30\12\0\12\30"+
    "\1\106\11\30\20\0\2\30\12\0\3\30\1\107\20\30"+
    "\20\0\2\30\12\0\16\30\1\110\5\30\20\0\2\30"+
    "\12\0\17\30\1\111\4\30\57\0\1\112\50\0\1\113"+
    "\47\0\1\114\37\0\2\30\12\0\1\30\1\115\22\30"+
    "\20\0\2\30\12\0\2\30\1\116\21\30\20\0\2\30"+
    "\12\0\4\30\1\117\17\30\20\0\2\30\12\0\4\30"+
    "\1\120\17\30\20\0\2\30\12\0\4\30\1\121\17\30"+
    "\20\0\2\30\12\0\22\30\1\122\1\30\20\0\2\30"+
    "\12\0\10\30\1\123\13\30\40\0\1\124\10\0\1\125"+
    "\45\0\1\126\72\0\1\127\25\0\2\30\12\0\11\30"+
    "\1\130\12\30\20\0\2\30\12\0\22\30\1\131\1\30"+
    "\20\0\2\30\12\0\17\30\1\132\4\30\20\0\2\30"+
    "\12\0\20\30\1\133\3\30\20\0\2\30\12\0\10\30"+
    "\1\134\13\30\20\0\2\30\12\0\13\30\1\135\10\30"+
    "\36\0\1\136\61\0\1\137\57\0\1\140\75\0\1\141"+
    "\21\0\2\30\12\0\4\30\1\142\17\30\20\0\2\30"+
    "\12\0\21\30\1\143\2\30\20\0\2\30\12\0\10\30"+
    "\1\144\13\30\20\0\2\30\12\0\17\30\1\145\4\30"+
    "\20\0\2\30\12\0\6\30\1\146\15\30\56\0\1\147"+
    "\54\0\1\150\50\0\1\151\33\0\2\30\12\0\10\30"+
    "\1\152\13\30\20\0\2\30\12\0\12\30\1\153\11\30"+
    "\20\0\2\30\12\0\4\30\1\154\17\30\55\0\1\155"+
    "\46\0\1\156\66\0\1\157\24\0\2\30\12\0\14\30"+
    "\1\160\7\30\20\0\2\30\12\0\4\30\1\161\17\30"+
    "\20\0\2\30\12\0\12\30\1\162\11\30\44\0\1\163"+
    "\61\0\1\164\51\0\1\165\37\0\2\30\12\0\13\30"+
    "\1\166\10\30\20\0\2\30\12\0\13\30\1\167\10\30"+
    "\20\0\2\30\12\0\4\30\1\170\17\30\50\0\1\171"+
    "\47\0\1\172\65\0\1\173\31\0\2\30\12\0\21\30"+
    "\1\174\2\30\20\0\2\30\12\0\13\30\1\175\10\30"+
    "\47\0\1\176\57\0\1\177\50\0\1\200\37\0\2\30"+
    "\12\0\21\30\1\201\2\30\55\0\1\202\51\0\1\203"+
    "\30\0\2\30\12\0\20\30\1\204\3\30\55\0\1\205"+
    "\56\0\1\206\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4464];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\2\11\1\1\4\11\1\1\1\11\3\1\5\11"+
    "\1\1\2\11\11\1\2\11\1\1\1\11\3\1\1\11"+
    "\1\1\2\0\1\11\1\0\1\11\13\1\3\0\4\11"+
    "\11\1\3\0\7\1\4\0\6\1\2\0\1\11\1\0"+
    "\5\1\3\0\3\1\3\0\3\1\3\0\3\1\3\0"+
    "\2\1\1\11\2\0\1\1\1\11\1\0\1\1\1\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    public int getLine(){
        return yyline;
    }

    String string = "";


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  MPLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          {     return new Symbol(sym.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.err.println(" ERROR: " + yytext() );
            }
            // fall through
          case 47: break;
          case 2:
            { ;
            }
            // fall through
          case 48: break;
          case 3:
            { string = ""; yybegin(STRING);
            }
            // fall through
          case 49: break;
          case 4:
            { return new Symbol( sym.OPEN_ROUND_BRACKETS );
            }
            // fall through
          case 50: break;
          case 5:
            { return new Symbol( sym.CLOSE_ROUND_BRACKETS );
            }
            // fall through
          case 51: break;
          case 6:
            { return new Symbol( sym.MULTIPLY );
            }
            // fall through
          case 52: break;
          case 7:
            { return new Symbol( sym.PLUS );
            }
            // fall through
          case 53: break;
          case 8:
            { return new Symbol( sym.COMMA );
            }
            // fall through
          case 54: break;
          case 9:
            { return new Symbol( sym.CONST );
            }
            // fall through
          case 55: break;
          case 10:
            { return new Symbol( sym.COLON );
            }
            // fall through
          case 56: break;
          case 11:
            { return new Symbol( sym.SEMICOLON );
            }
            // fall through
          case 57: break;
          case 12:
            { return new Symbol( sym.OPEN_ANGLE_BRACKETS );
            }
            // fall through
          case 58: break;
          case 13:
            { return new Symbol( sym.ASSIGN );
            }
            // fall through
          case 59: break;
          case 14:
            { return new Symbol( sym.CLOSE_ANGLE_BRACKETS );
            }
            // fall through
          case 60: break;
          case 15:
            { return new Symbol( sym.OPEN_SQUARE_BRACKETS );
            }
            // fall through
          case 61: break;
          case 16:
            { return new Symbol( sym.CLOSE_SQUARE_BRACKETS );
            }
            // fall through
          case 62: break;
          case 17:
            { return new Symbol ( sym.ID );
            }
            // fall through
          case 63: break;
          case 18:
            { return new Symbol( sym.OPEN_CURLY_BRACKETS );
            }
            // fall through
          case 64: break;
          case 19:
            { return new Symbol( sym.CLOSE_CURLY_BRACKETS );
            }
            // fall through
          case 65: break;
          case 20:
            { string += ('\n');
            }
            // fall through
          case 66: break;
          case 21:
            { string += ( yytext() );
            }
            // fall through
          case 67: break;
          case 22:
            { yybegin(YYINITIAL);
                                     return new Symbol( sym.CONST );
            }
            // fall through
          case 68: break;
          case 23:
            { string += ('\\');
            }
            // fall through
          case 69: break;
          case 24:
            { System.out.println("comm");yybegin(COMMENT);
            }
            // fall through
          case 70: break;
          case 25:
            { return new Symbol ( sym.WP );
            }
            // fall through
          case 71: break;
          case 26:
            { return new Symbol ( sym.EQ );
            }
            // fall through
          case 72: break;
          case 27:
            { return new Symbol ( sym.GT );
            }
            // fall through
          case 73: break;
          case 28:
            { return new Symbol ( sym.IF );
            }
            // fall through
          case 74: break;
          case 29:
            { return new Symbol ( sym.LT );
            }
            // fall through
          case 75: break;
          case 30:
            { yybegin(YYINITIAL);
            }
            // fall through
          case 76: break;
          case 31:
            { string += ('\"');
            }
            // fall through
          case 77: break;
          case 32:
            { string += ('\r');
            }
            // fall through
          case 78: break;
          case 33:
            { string += ('\t');
            }
            // fall through
          case 79: break;
          case 34:
            { return new Symbol ( sym.INT );
            }
            // fall through
          case 80: break;
          case 35:
            { return new Symbol ( sym.NAME );
            }
            // fall through
          case 81: break;
          case 36:
            { return new Symbol ( sym.NODE_BEGIN );
            }
            // fall through
          case 82: break;
          case 37:
            { return new Symbol ( sym.NODES );
            }
            // fall through
          case 83: break;
          case 38:
            { return new Symbol ( sym.NODE_END );
            }
            // fall through
          case 84: break;
          case 39:
            { return new Symbol ( sym.DOUBLE );
            }
            // fall through
          case 85: break;
          case 40:
            { return new Symbol ( sym.STRING );
            }
            // fall through
          case 86: break;
          case 41:
            { return new Symbol ( sym.EXECUTION_BEGIN );
            }
            // fall through
          case 87: break;
          case 42:
            { return new Symbol ( sym.EXPERIMENT_BEGIN );
            }
            // fall through
          case 88: break;
          case 43:
            { return new Symbol ( sym.EXECUTION_END );
            }
            // fall through
          case 89: break;
          case 44:
            { return new Symbol ( sym.EXPERIMENT_END );
            }
            // fall through
          case 90: break;
          case 45:
            { return new Symbol ( sym.REQUIREMENTS_BEGIN );
            }
            // fall through
          case 91: break;
          case 46:
            { return new Symbol ( sym.REQUIREMENTS_END );
            }
            // fall through
          case 92: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
