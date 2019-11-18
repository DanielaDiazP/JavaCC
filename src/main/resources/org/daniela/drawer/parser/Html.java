/* Generated By:JavaCC: Do not edit this line. Html.java */
package org.caferrerb.drawer.parser;

public class Html implements HtmlConstants {
  public static void main(String args[]) throws ParseException {
    Html parser = new Html(System.in);
    while (true) {
      System.out.println("Reading from standard input...");
      System.out.print("Enter an expression like \u005c"1+(2+3)*4;\u005c" :");
      try {
        switch (Html.html()) {
        case 0:
          System.out.println("OK.");
          break;
        case 1:
          System.out.println("Goodbye.");
          break;
        default:
          break;
        }
      } catch (Exception e) {
        System.out.println("NOK.");
        System.out.println(e.getMessage());
        Html.ReInit(System.in);
      } catch (Error e) {
        System.out.println("Oops.");
        System.out.println(e.getMessage());
        break;
      }
    }
  }

  static final public html html() throws ParseException {
    head he;
    body bo;
    jj_consume_token(10);
    he = head();
    bo = body();
    jj_consume_token(11);
    {
      if (true)
        return new titulo(ident.image);
    }
    throw new Error("Missing return statement in function");

  }

  static final public void head() throws ParseException {
    jj_consume_token(12);
    switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
    case 17:
      tamano();
      break;
    default:
      jj_la1[0] = jj_gen;
      ;
    }
    jj_consume_token(13);
    titulo();
    jj_consume_token(14);
  }

  static final public titulo titulo() throws ParseException {
    Token ident;
    jj_consume_token(15);
    ident = jj_consume_token(IDENTIFICADOR);
    jj_consume_token(16);
    {
      if (true)
        return new titulo(ident.image);
    }
    throw new Error("Missing return statement in function");

  }

  static final public void tamano() throws ParseException {
    jj_consume_token(17);
    jj_consume_token(CONSTANT);
    jj_consume_token(18);
    jj_consume_token(CONSTANT);
    jj_consume_token(19);
  }

  static final public int body() throws ParseException {
    jj_consume_token(20);
    label_1: while (true) {
      switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
      case 22:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
      layout();
    }
    jj_consume_token(21);
    return jj_ntk;
  }

  static final public void layout() throws ParseException {
    jj_consume_token(22);
    jj_consume_token(CONSTANT);
    jj_consume_token(23);
    jj_consume_token(CONSTANT);
    jj_consume_token(13);
    row();
    jj_consume_token(24);
  }

  static final public void row() throws ParseException {
    jj_consume_token(25);
    label_2: while (true) {
      switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
      case 27:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      col();
    }
    jj_consume_token(26);
  }

  static final public void col() throws ParseException {
    jj_consume_token(27);
    jj_consume_token(LETRA);
    jj_consume_token(28);
  }

  static final public void image() throws ParseException {
    jj_consume_token(29);
    src();
    alt();
    jj_consume_token(13);
  }

  static final public void src() throws ParseException {
    jj_consume_token(30);
    url();
    jj_consume_token(19);
  }

  static final public void url() throws ParseException {
    label_3: while (true) {
      switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
      case 31:
        jj_consume_token(31);
        break;
      case 32:
        jj_consume_token(32);
        break;
      case IDENTIFICADOR:
        jj_consume_token(IDENTIFICADOR);
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
      case 33:
        jj_consume_token(33);
        break;
      default:
        jj_la1[4] = jj_gen;
        ;
      }
      switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
      case IDENTIFICADOR:
      case 31:
      case 32:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_3;
      }
    }
  }

  static final public void alt() throws ParseException {
    jj_consume_token(34);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(19);
  }

  static final public void label() throws ParseException {
    jj_consume_token(35);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(36);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(37);
  }

  static final public void radiobutton() throws ParseException {
    jj_consume_token(38);
    label_4: while (true) {
      radio();
      switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
      case 40:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_4;
      }
    }
    jj_consume_token(39);
  }

  static final public void radio() throws ParseException {
    jj_consume_token(40);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(41);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(42);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(43);
  }

  static final public void select() throws ParseException {
    jj_consume_token(44);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(42);
    label_5: while (true) {
      cuerpo();
      switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
      case 46:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_5;
      }
    }
    jj_consume_token(45);
  }

  static final public void cuerpo() throws ParseException {
    jj_consume_token(46);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(42);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(47);
  }

  static final public void table() throws ParseException {
    jj_consume_token(48);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(42);
    label_6: while (true) {
      switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
      case 50:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_6;
      }
      listaTR();
    }
    jj_consume_token(49);
  }

  static final public void listaTR() throws ParseException {
    jj_consume_token(50);
    label_7: while (true) {
      switch ((jj_ntk == -1) ? jj_ntk() : jj_ntk) {
      case 52:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_7;
      }
      listaTD();
    }
    jj_consume_token(51);
  }

  static final public void listaTD() throws ParseException {
    jj_consume_token(52);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(53);
  }

  static final public void typeText() throws ParseException {
    jj_consume_token(54);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(55);
    jj_consume_token(IDENTIFICADOR);
    jj_consume_token(56);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public HtmlTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[10];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
    jj_la1_init_0();
    jj_la1_init_1();
  }

  private static void jj_la1_init_0() {
    jj_la1_0 = new int[] { 0x20000, 0x400000, 0x8000000, 0x80000100, 0x0, 0x80000100, 0x0, 0x0, 0x0, 0x0, };
  }

  private static void jj_la1_init_1() {
    jj_la1_1 = new int[] { 0x0, 0x0, 0x0, 0x1, 0x2, 0x1, 0x100, 0x4000, 0x40000, 0x100000, };
  }

  /** Constructor with InputStream. */
  public Html(java.io.InputStream stream) {
    this(stream, null);
  }

  /** Constructor with InputStream and supplied encoding */
  public Html(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try {
      jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1);
    } catch (java.io.UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
    token_source = new HtmlTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++)
      jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
    ReInit(stream, null);
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try {
      jj_input_stream.ReInit(stream, encoding, 1, 1);
    } catch (java.io.UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++)
      jj_la1[i] = -1;
  }

  /** Constructor. */
  public Html(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new HtmlTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++)
      jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++)
      jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Html(HtmlTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++)
      jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(HtmlTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++)
      jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null)
      token = token.next;
    else
      token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  /** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null)
      token = token.next;
    else
      token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  /** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null)
        t = t.next;
      else
        t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt = token.next) == null)
      return (jj_ntk = (token.next = token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[57];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 10; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1 << j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1 << j)) != 0) {
            la1tokens[32 + j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 57; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
