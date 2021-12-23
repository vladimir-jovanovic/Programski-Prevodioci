
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class MPParserWithErrors extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public MPParserWithErrors() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public MPParserWithErrors(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public MPParserWithErrors(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\057\000\002\002\005\000\002\002\004\000\002\003" +
    "\006\000\002\004\003\000\002\011\005\000\002\011\004" +
    "\000\002\011\003\000\002\012\005\000\002\012\005\000" +
    "\002\013\003\000\002\013\003\000\002\013\003\000\002" +
    "\005\005\000\002\005\003\000\002\005\004\000\002\006" +
    "\003\000\002\006\003\000\002\015\012\000\002\015\007" +
    "\000\002\016\005\000\002\016\003\000\002\017\003\000" +
    "\002\017\003\000\002\020\003\000\002\020\003\000\002" +
    "\020\003\000\002\014\005\000\002\007\005\000\002\022" +
    "\005\000\002\022\005\000\002\010\005\000\002\023\005" +
    "\000\002\023\003\000\002\023\004\000\002\024\007\000" +
    "\002\025\004\000\002\026\005\000\002\027\005\000\002" +
    "\027\003\000\002\027\004\000\002\030\012\000\002\031" +
    "\003\000\002\032\003\000\002\033\003\000\002\021\005" +
    "\000\002\021\005\000\002\021\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\140\000\004\004\005\001\002\000\004\002\142\001" +
    "\002\000\012\003\014\021\007\022\012\023\011\001\002" +
    "\000\004\017\137\001\002\000\004\017\ufff8\001\002\000" +
    "\012\003\ufffb\006\ufffb\017\ufffb\024\ufffb\001\002\000\004" +
    "\017\ufff6\001\002\000\004\017\ufff7\001\002\000\010\003" +
    "\025\006\031\017\023\001\002\000\010\021\007\022\012" +
    "\023\011\001\002\000\004\005\021\001\002\000\012\003" +
    "\ufffe\006\ufffe\017\ufffe\024\017\001\002\000\010\021\007" +
    "\022\012\023\011\001\002\000\012\003\ufffd\006\ufffd\017" +
    "\ufffd\024\ufffd\001\002\000\004\002\001\001\002\000\012" +
    "\003\ufffc\006\ufffc\017\ufffc\024\ufffc\001\002\000\004\034" +
    "\130\001\002\000\010\007\ufff1\024\ufff1\041\ufff1\001\002" +
    "\000\006\006\031\017\023\001\002\000\010\007\ufff4\024" +
    "\ufff4\041\ufff4\001\002\000\010\007\ufff2\024\ufff2\041\ufff2" +
    "\001\002\000\006\007\054\024\051\001\002\000\004\036" +
    "\032\001\002\000\006\017\034\020\033\001\002\000\030" +
    "\007\uffeb\024\uffeb\026\uffeb\027\uffeb\030\uffeb\031\uffeb\032" +
    "\uffeb\033\uffeb\037\uffeb\041\uffeb\045\uffeb\001\002\000\030" +
    "\007\uffec\024\uffec\026\uffec\027\uffec\030\uffec\031\uffec\032" +
    "\uffec\033\uffec\037\uffec\041\uffec\045\uffec\001\002\000\004" +
    "\037\044\001\002\000\012\027\040\030\041\031\042\037" +
    "\uffed\001\002\000\006\017\034\020\033\001\002\000\006" +
    "\017\uffea\020\uffea\001\002\000\006\017\uffe9\020\uffe9\001" +
    "\002\000\006\017\uffe8\020\uffe8\001\002\000\004\037\uffee" +
    "\001\002\000\006\003\045\025\046\001\002\000\010\007" +
    "\uffef\024\uffef\041\uffef\001\002\000\004\040\047\001\002" +
    "\000\010\003\025\006\031\017\023\001\002\000\006\024" +
    "\051\041\052\001\002\000\006\006\031\017\023\001\002" +
    "\000\010\007\ufff0\024\ufff0\041\ufff0\001\002\000\010\007" +
    "\ufff5\024\ufff5\041\ufff5\001\002\000\004\011\121\001\002" +
    "\000\004\012\056\001\002\000\006\003\060\014\061\001" +
    "\002\000\004\005\uffff\001\002\000\004\014\061\001\002" +
    "\000\004\035\070\001\002\000\006\013\065\024\064\001" +
    "\002\000\006\013\uffe1\024\uffe1\001\002\000\004\014\061" +
    "\001\002\000\004\005\uffe3\001\002\000\006\013\uffe2\024" +
    "\uffe2\001\002\000\004\026\072\001\002\000\004\017\071" +
    "\001\002\000\004\026\uffde\001\002\000\004\042\073\001" +
    "\002\000\006\003\077\016\100\001\002\000\004\015\075" +
    "\001\002\000\006\013\uffdf\024\uffdf\001\002\000\006\024" +
    "\uffdb\043\uffdb\001\002\000\004\016\100\001\002\000\004" +
    "\044\105\001\002\000\006\024\102\043\103\001\002\000" +
    "\004\016\100\001\002\000\004\015\uffdd\001\002\000\006" +
    "\024\uffdc\043\uffdc\001\002\000\006\017\034\020\033\001" +
    "\002\000\004\026\uffd8\001\002\000\004\026\110\001\002" +
    "\000\006\017\034\020\033\001\002\000\004\026\uffd7\001" +
    "\002\000\004\026\113\001\002\000\006\017\034\020\033" +
    "\001\002\000\004\045\uffd6\001\002\000\004\045\116\001" +
    "\002\000\006\024\uffd9\043\uffd9\001\002\000\006\024\uffda" +
    "\043\uffda\001\002\000\006\013\uffe0\024\uffe0\001\002\000" +
    "\004\020\124\001\002\000\004\010\123\001\002\000\004" +
    "\012\uffe6\001\002\000\006\003\126\024\125\001\002\000" +
    "\004\010\uffe5\001\002\000\004\010\uffe4\001\002\000\010" +
    "\007\ufff3\024\ufff3\041\ufff3\001\002\000\006\017\034\020" +
    "\033\001\002\000\014\007\uffd3\024\uffd3\032\uffd3\033\uffd3" +
    "\041\uffd3\001\002\000\014\007\uffe7\024\uffe7\032\133\033" +
    "\134\041\uffe7\001\002\000\006\017\034\020\033\001\002" +
    "\000\006\017\034\020\033\001\002\000\014\007\uffd4\024" +
    "\uffd4\032\uffd4\033\uffd4\041\uffd4\001\002\000\014\007\uffd5" +
    "\024\uffd5\032\uffd5\033\uffd5\041\uffd5\001\002\000\006\003" +
    "\141\024\140\001\002\000\012\003\ufffa\006\ufffa\017\ufffa" +
    "\024\ufffa\001\002\000\012\003\ufff9\006\ufff9\017\ufff9\024" +
    "\ufff9\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\140\000\004\002\003\001\001\000\002\001\001\000" +
    "\014\003\014\004\012\011\015\012\007\013\005\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\012\005\027\006\025" +
    "\014\026\015\023\001\001\000\006\012\021\013\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\012\017" +
    "\013\005\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\006\126\014\026\015\023\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\007\054\001\001\000\002\001\001" +
    "\000\006\016\034\017\035\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\020\036\001\001" +
    "\000\004\017\042\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\005\047\006" +
    "\025\014\026\015\023\001\001\000\002\001\001\000\010" +
    "\006\052\014\026\015\023\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\022\121\001\001\000\004\010\056" +
    "\001\001\000\006\023\061\024\062\001\001\000\002\001" +
    "\001\000\004\024\117\001\001\000\004\025\066\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\024\065\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\026\073\001" +
    "\001\000\006\027\100\030\075\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\030\116\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\030\103" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\017" +
    "\105\031\106\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\017\110\032\111\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\017\113\033\114\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\017\130\021\131" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\017" +
    "\135\001\001\000\004\017\134\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$MPParserWithErrors$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$MPParserWithErrors$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$MPParserWithErrors$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public int errorCount = 0;

    public ArrayList<String> syntaxErrorsList = new ArrayList<String>();

    public static void main( String[] args )
    {
        try
        {
            FileReader file = new FileReader( args[0] );
            Scanner scanner = new MPLexer( file );
            MPParserWithErrors parser = new MPParserWithErrors( scanner );
            parser.parse();

            parser.printErrors();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }

   }

   public void syntax_error(Symbol current_token){
    
   }

   public void report_error(String message, Object info){

   }

   public int getLine(){
       return ((MPLexer)getScanner()).getLine();
   }
   
   public void printErrors(){
       if(syntaxErrorsList.size() == 0) System.out.println("No errors.");
       else{
        System.out.println("\n\nNumber of syntax errors: " + syntaxErrorsList.size());
        for(String error : syntaxErrorsList){
            System.out.println(error);
            }
        }
   }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$MPParserWithErrors$actions {
  private final MPParserWithErrors parser;

  /** Constructor */
  CUP$MPParserWithErrors$actions(MPParserWithErrors parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$MPParserWithErrors$do_action_part00000000(
    int                        CUP$MPParserWithErrors$act_num,
    java_cup.runtime.lr_parser CUP$MPParserWithErrors$parser,
    java.util.Stack            CUP$MPParserWithErrors$stack,
    int                        CUP$MPParserWithErrors$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$MPParserWithErrors$result;

      /* select the action based on the action number */
      switch (CUP$MPParserWithErrors$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Experiment ::= EXPERIMENT_BEGIN Body EXPERIMENT_END 
            {
              Object RESULT =null;
		
    System.out.println("Experiment -> experiment Body ~experiment");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Experiment",0, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Experiment EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-1)).value;
		RESULT = start_val;
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-1)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$MPParserWithErrors$parser.done_parsing();
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Body ::= Declarations Statements Requirements Execution 
            {
              Object RESULT =null;
		
    System.out.println("Body -> Declarations Statements Requirements Execution");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Body",1, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-3)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Declarations ::= VariableDeclaration 
            {
              Object RESULT =null;
		
    System.out.println("Declarations -> VariableDeclaration");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Declarations",2, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // VariableDeclaration ::= VariableDeclaration SEMICOLON Variable 
            {
              Object RESULT =null;
		
    System.out.println("VariableDeclaration -> VariableDeclaration ; Variable");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("VariableDeclaration",7, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VariableDeclaration ::= error Variable 
            {
              Object RESULT =null;
		
        syntaxErrorsList.add("Missing semicolon in line number: " + parser.getLine());
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("VariableDeclaration",7, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-1)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // VariableDeclaration ::= Variable 
            {
              Object RESULT =null;
		
        System.out.println("VariableDeclaration -> Variable");
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("VariableDeclaration",7, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Variable ::= Type ID SEMICOLON 
            {
              Object RESULT =null;
		
    System.out.println("Variable -> Type ID ;");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Variable",8, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Variable ::= Type ID error 
            {
              Object RESULT =null;
		
        syntaxErrorsList.add("Missing semicolon in line number: " + parser.getLine());
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Variable",8, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Type ::= INT 
            {
              Object RESULT =null;
		
    System.out.println("Type -> int");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Type",9, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Type ::= DOUBLE 
            {
              Object RESULT =null;
		
        System.out.println("Type -> double");
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Type",9, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Type ::= STRING 
            {
              Object RESULT =null;
		
        System.out.println("Type -> string");
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Type",9, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Statements ::= Statements SEMICOLON Statement 
            {
              Object RESULT =null;
		
    System.out.println("Statements -> Statements ; Statement");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Statements",3, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Statements ::= Statement 
            {
              Object RESULT =null;
		
        System.out.println("Statements -> Statement");
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Statements",3, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Statements ::= error Statement 
            {
              Object RESULT =null;
		
        syntaxErrorsList.add("Missing semicolon in line number: " + parser.getLine());
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Statements",3, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-1)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Statement ::= Assignment 
            {
              Object RESULT =null;
		
    System.out.println("Statement -> Assignment");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Statement",4, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Statement ::= IfStatement 
            {
              Object RESULT =null;
		
        System.out.println("Statement -> Assignment");
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Statement",4, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // IfStatement ::= IF OPEN_ROUND_BRACKETS RelExpression CLOSE_ROUND_BRACKETS COLON OPEN_CURLY_BRACKETS Statements CLOSE_CURLY_BRACKETS 
            {
              Object RESULT =null;
		
    System.out.println("IfStatement -> if \\(RelExpression\\) : {Statements}");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("IfStatement",11, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-7)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // IfStatement ::= IF OPEN_ROUND_BRACKETS RelExpression CLOSE_ROUND_BRACKETS error 
            {
              Object RESULT =null;
		
        syntaxErrorsList.add("Missing colon in line number: " + parser.getLine());
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("IfStatement",11, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-4)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // RelExpression ::= Term RelOp Term 
            {
              Object RESULT =null;
		
    System.out.println("RelExpression -> Term RelOp Term");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("RelExpression",12, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // RelExpression ::= Term 
            {
              Object RESULT =null;
		
        System.out.println("RelExpression -> Term");
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("RelExpression",12, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Term ::= ID 
            {
              Object RESULT =null;
		
    System.out.println("Term -> ID");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Term",13, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Term ::= CONST 
            {
              Object RESULT =null;
		
        System.out.println("Term -> CONST");
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Term",13, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // RelOp ::= LT 
            {
              Object RESULT =null;
		
    System.out.println("RelOp -> lt");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("RelOp",14, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // RelOp ::= EQ 
            {
              Object RESULT =null;
		
        System.out.println("RelOp -> eq");
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("RelOp",14, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // RelOp ::= GT 
            {
              Object RESULT =null;
		
        System.out.println("RelOp -> gt");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("RelOp",14, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // Assignment ::= ID ASSIGN Expression 
            {
              Object RESULT =null;
		
    System.out.println("Assignment -> ID = Expression");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Assignment",10, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // Requirements ::= REQUIREMENTS_BEGIN NodeNumber REQUIREMENTS_END 
            {
              Object RESULT =null;
		
    System.out.println("Requirements -> requirements nodeNumber ~requirements");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Requirements",5, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // NodeNumber ::= NODES CONST SEMICOLON 
            {
              Object RESULT =null;
		
    System.out.println("NodeNumber -> nodes CONST;");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("NodeNumber",16, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // NodeNumber ::= NODES CONST error 
            {
              Object RESULT =null;
		
        syntaxErrorsList.add("Missing semicolon in line number: " + parser.getLine());
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("NodeNumber",16, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // Execution ::= EXECUTION_BEGIN NodeList EXECUTION_END 
            {
              Object RESULT =null;
		
    System.out.println("Execution -> execution NodeList ~execution");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Execution",6, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // NodeList ::= NodeList SEMICOLON NodeDef 
            {
              Object RESULT =null;
		
    System.out.println("NodeList -> NodeList ; NodeDef");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("NodeList",17, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // NodeList ::= NodeDef 
            {
              Object RESULT =null;
		
        System.out.println("NodeList -> NodeDef");
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("NodeList",17, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // NodeList ::= error NodeDef 
            {
              Object RESULT =null;
		
        syntaxErrorsList.add("Missing semicolon in line number: " + parser.getLine());
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("NodeList",17, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-1)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // NodeDef ::= NODE_BEGIN NodeName COMMA Route NODE_END 
            {
              Object RESULT =null;
		
    System.out.println("NodeDef -> node NodeName, Route ~node");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("NodeDef",18, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-4)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // NodeName ::= NAME ID 
            {
              Object RESULT =null;
		
    System.out.println("NodeName -> name ID");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("NodeName",19, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-1)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // Route ::= OPEN_SQUARE_BRACKETS Waypoints CLOSE_SQUARE_BRACKETS 
            {
              Object RESULT =null;
		
    System.out.println("Route -> [Waypoints]");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Route",20, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // Waypoints ::= Waypoints SEMICOLON Waypoint 
            {
              Object RESULT =null;
		
    System.out.println("Waypoints -> Waypoints ; Waypoint");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Waypoints",21, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // Waypoints ::= Waypoint 
            {
              Object RESULT =null;
		
        System.out.println("Waypoints -> Waypoint");
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Waypoints",21, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // Waypoints ::= error Waypoint 
            {
              Object RESULT =null;
		
        syntaxErrorsList.add("Missing semicolon in line number: " + parser.getLine());
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Waypoints",21, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-1)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // Waypoint ::= WP OPEN_ANGLE_BRACKETS X COMMA Y COMMA Z CLOSE_ANGLE_BRACKETS 
            {
              Object RESULT =null;
		
    System.out.println("Waypoint -> WP<X, Y, Z>");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Waypoint",22, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-7)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // X ::= Term 
            {
              Object RESULT =null;
		
    System.out.println("X -> Term");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("X",23, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // Y ::= Term 
            {
              Object RESULT =null;
		
    System.out.println("Y -> Term");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Y",24, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // Z ::= Term 
            {
              Object RESULT =null;
		
    System.out.println("Z -> Term");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Z",25, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // Expression ::= Expression PLUS Term 
            {
              Object RESULT =null;
		
    System.out.println("Expression -> Expression + Term");
    
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Expression",15, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // Expression ::= Expression MULTIPLY Term 
            {
              Object RESULT =null;
		
        System.out.println("Expression -> Expression * Term");
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Expression",15, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.elementAt(CUP$MPParserWithErrors$top-2)), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // Expression ::= Term 
            {
              Object RESULT =null;
		
        System.out.println("Expression -> Term");
        
              CUP$MPParserWithErrors$result = parser.getSymbolFactory().newSymbol("Expression",15, ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), ((java_cup.runtime.Symbol)CUP$MPParserWithErrors$stack.peek()), RESULT);
            }
          return CUP$MPParserWithErrors$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$MPParserWithErrors$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$MPParserWithErrors$do_action(
    int                        CUP$MPParserWithErrors$act_num,
    java_cup.runtime.lr_parser CUP$MPParserWithErrors$parser,
    java.util.Stack            CUP$MPParserWithErrors$stack,
    int                        CUP$MPParserWithErrors$top)
    throws java.lang.Exception
    {
              return CUP$MPParserWithErrors$do_action_part00000000(
                               CUP$MPParserWithErrors$act_num,
                               CUP$MPParserWithErrors$parser,
                               CUP$MPParserWithErrors$stack,
                               CUP$MPParserWithErrors$top);
    }
}

}