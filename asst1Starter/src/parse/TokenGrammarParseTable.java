package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
public class TokenGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 150; }
public int getNttSym() { return 151; }
private String[] symNameTable = {
"$$start",
"start",
"white*",
"$$0",
"token",
"`boolean",
"`class",
"`extends",
"`void",
"`int",
"`while",
"`if",
"`else",
"`for",
"`break",
"`this",
"`false",
"`true",
"`super",
"`null",
"`return",
"`instanceof",
"`new",
"`abstract",
"`assert",
"`byte",
"`case",
"`catch",
"`char",
"`const",
"`continue",
"`default",
"`do",
"`double",
"`enum",
"`final",
"`finally",
"`float",
"`goto",
"`implements",
"`import",
"`interface",
"`long",
"`native",
"`package",
"`private",
"`protected",
"`public",
"`short",
"`static",
"`strictfp",
"`switch",
"`synchronized",
"`throw",
"`throws",
"`transient",
"`try",
"`volatile",
"`!",
"`!=",
"`%",
"`&&",
"`*",
"`(",
"`)",
"`{",
"`}",
"`-",
"`+",
"`=",
"`==",
"`[",
"`]",
"`||",
"`<",
"`<=",
"`,",
"`>",
"`>=",
"`.",
"`;",
"`++",
"`--",
"`/",
"`:",
"ID",
"INT_LITERAL",
"STRING_LITERAL",
"CHARACTER_LITERAL",
"\"c\"",
"\"l\"",
"\"a\"",
"\"s\"",
"idChar",
"\"e\"",
"\"b\"",
"\"o\"",
"\"n\"",
"\"x\"",
"\"t\"",
"\"d\"",
"\"v\"",
"\"i\"",
"\"w\"",
"\"h\"",
"\"f\"",
"\"r\"",
"\"k\"",
"\"u\"",
"\"p\"",
"\"!\"",
"\"=\"",
"\"+\"",
"\"%\"",
"\"&\"",
"\"*\"",
"\"(\"",
"\")\"",
"\"{\"",
"\"}\"",
"\"-\"",
"\"[\"",
"\"]\"",
"\"|\"",
"\"<\"",
"\",\"",
"\">\"",
"\":\"",
"\".\"",
"\";\"",
"\"/\"",
"digit++",
"sq",
"\"\'\"",
"printable",
"letter",
"digit",
"\"_\"",
"{\"A\"..\"Z\" \"g\" \"j\" \"m\" \"q\" \"y\"..\"z\"}",
"{\"0\"..\"9\"}",
"white",
"\" \"",
"{9 12}",
"eol",
"10",
"13",
"{\'\"\'..\"$\" \"?\"..\"@\" \"\\\" \"^\" \"`\" \"~\"}",
"255",
"token*",
"digit+",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private TokenGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 152;}
private static final int MIN_REDUCTION = 321;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+1;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
-1, // $$start
91, // start
102, // white*
186, // $$0
115, // token
212, // `boolean
142, // `class
107, // `extends
148, // `void
111, // `int
252, // `while
204, // `if
161, // `else
290, // `for
97, // `break
278, // `this
154, // `false
11, // `true
194, // `super
302, // `null
217, // `return
36, // `instanceof
168, // `new
289, // `abstract
57, // `assert
179, // `byte
16, // `case
13, // `catch
158, // `char
15, // `const
56, // `continue
234, // `default
250, // `do
216, // `double
226, // `enum
225, // `final
296, // `finally
104, // `float
205, // `goto
310, // `implements
164, // `import
47, // `interface
27, // `long
71, // `native
49, // `package
62, // `private
272, // `protected
18, // `public
308, // `short
295, // `static
300, // `strictfp
72, // `switch
125, // `synchronized
65, // `throw
187, // `throws
149, // `transient
6, // `try
112, // `volatile
131, // `!
231, // `!=
253, // `%
228, // `&&
209, // `*
50, // `(
288, // `)
145, // `{
141, // `}
20, // `-
123, // `+
251, // `=
25, // `==
263, // `[
287, // `]
246, // `||
185, // `<
309, // `<=
230, // `,
48, // `>
26, // `>=
51, // `.
218, // `;
170, // `++
207, // `--
79, // `/
30, // `:
83, // ID
14, // INT_LITERAL
197, // STRING_LITERAL
275, // CHARACTER_LITERAL
35, // "c"
-1, // "l"
-1, // "a"
156, // "s"
-1, // idChar
24, // "e"
235, // "b"
-1, // "o"
291, // "n"
-1, // "x"
128, // "t"
-1, // "d"
182, // "v"
96, // "i"
87, // "w"
-1, // "h"
265, // "f"
167, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
23, // "!"
233, // "="
82, // "+"
110, // "%"
39, // "&"
178, // "*"
249, // "("
76, // ")"
232, // "{"
144, // "}"
299, // "-"
53, // "["
127, // "]"
116, // "|"
105, // "<"
146, // ","
201, // ">"
254, // ":"
54, // "."
195, // ";"
92, // "/"
28, // digit++
106, // sq
80, // "'"
-1, // printable
-1, // letter
267, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
184, // {"0".."9"}
138, // white
245, // " "
245, // {9 12}
8, // eol
181, // {10}
74, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // {255}
84, // token*
121, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 1
  }
,
{ // state 2
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 3
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 4
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 5
94,99, // "e"
  }
,
{ // state 6
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 7
0x80000000|1, // match move
0x80000000|135, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 8
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 9
92,17, // "s"
99,189, // "t"
  }
,
{ // state 10
92,222, // "s"
  }
,
{ // state 11
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 12
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 13
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 14
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 17
99,137, // "t"
  }
,
{ // state 18
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 19
0x80000000|1, // match move
0x80000000|206, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 20
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 21
0x80000000|1, // match move
0x80000000|177, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 22
2,305, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 23
0x80000000|244, // match move
0x80000000|117, // no-match move
// T-test match for "=":
111,
  }
,
{ // state 24
90,315, // "l"
98,192, // "x"
  }
,
{ // state 25
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 26
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 27
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 28
2,273, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 29
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 30
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 31
2,119, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 32
94,118, // "e"
  }
,
{ // state 33
89,153, // "c"
  }
,
{ // state 34
97,237, // "n"
  }
,
{ // state 35
90,152, // "l"
  }
,
{ // state 36
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 37
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 38
91,243, // "a"
  }
,
{ // state 39
114,248, // "&"
  }
,
{ // state 40
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 42
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 43
0x80000000|1, // match move
0x80000000|284, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 44
2,120, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 45
94,227, // "e"
  }
,
{ // state 46
102,313, // "i"
  }
,
{ // state 47
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 48
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 49
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 50
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 51
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 52
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 53
2,220, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 54
2,283, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 55
2,183, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 58
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 59
96,171, // "o"
  }
,
{ // state 60
2,42, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 61
2,122, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 62
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 63
2,160, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 64
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 65
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 66
0x80000000|1, // match move
0x80000000|93, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 67
2,238, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 68
2,276, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 69
2,114, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 70
89,157, // "c"
90,157, // "l"
91,157, // "a"
92,157, // "s"
94,157, // "e"
95,157, // "b"
96,157, // "o"
97,157, // "n"
98,157, // "x"
99,157, // "t"
100,157, // "d"
101,157, // "v"
102,157, // "i"
103,157, // "w"
104,157, // "h"
105,157, // "f"
106,157, // "r"
107,157, // "k"
108,157, // "u"
109,157, // "p"
135,271, // letter
136,140, // digit
137,304, // "_"
138,157, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
139,155, // {"0".."9"}
  }
,
{ // state 71
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 72
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 73
112,69, // "+"
  }
,
{ // state 74
0x80000000|314, // match move
0x80000000|64, // no-match move
// T-test match for 10:
144,
  }
,
{ // state 75
132,282, // sq
133,280, // "'"
  }
,
{ // state 76
2,108, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 77
105,100, // "f"
  }
,
{ // state 78
2,12, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 81
94,90, // "e"
  }
,
{ // state 82
0x80000000|73, // match move
0x80000000|22, // no-match move
// T-test match for "+":
112,
  }
,
{ // state 83
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 84
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
41, // token
212, // `boolean
142, // `class
107, // `extends
148, // `void
111, // `int
252, // `while
204, // `if
161, // `else
290, // `for
97, // `break
278, // `this
154, // `false
11, // `true
194, // `super
302, // `null
217, // `return
36, // `instanceof
168, // `new
289, // `abstract
57, // `assert
179, // `byte
16, // `case
13, // `catch
158, // `char
15, // `const
56, // `continue
234, // `default
250, // `do
216, // `double
226, // `enum
225, // `final
296, // `finally
104, // `float
205, // `goto
310, // `implements
164, // `import
47, // `interface
27, // `long
71, // `native
49, // `package
62, // `private
272, // `protected
18, // `public
308, // `short
295, // `static
300, // `strictfp
72, // `switch
125, // `synchronized
65, // `throw
187, // `throws
149, // `transient
6, // `try
112, // `volatile
131, // `!
231, // `!=
253, // `%
228, // `&&
209, // `*
50, // `(
288, // `)
145, // `{
141, // `}
20, // `-
123, // `+
251, // `=
25, // `==
263, // `[
287, // `]
246, // `||
185, // `<
309, // `<=
230, // `,
48, // `>
26, // `>=
51, // `.
218, // `;
170, // `++
207, // `--
79, // `/
30, // `:
83, // ID
14, // INT_LITERAL
197, // STRING_LITERAL
275, // CHARACTER_LITERAL
35, // "c"
-1, // "l"
-1, // "a"
156, // "s"
-1, // idChar
24, // "e"
235, // "b"
-1, // "o"
291, // "n"
-1, // "x"
128, // "t"
-1, // "d"
182, // "v"
96, // "i"
87, // "w"
-1, // "h"
265, // "f"
167, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
23, // "!"
233, // "="
82, // "+"
110, // "%"
39, // "&"
178, // "*"
249, // "("
76, // ")"
232, // "{"
144, // "}"
299, // "-"
53, // "["
127, // "]"
116, // "|"
105, // "<"
146, // ","
201, // ">"
254, // ":"
54, // "."
195, // ";"
92, // "/"
28, // digit++
106, // sq
80, // "'"
-1, // printable
-1, // letter
267, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
184, // {"0".."9"}
-1, // white
-1, // " "
-1, // {9 12}
-1, // eol
-1, // {10}
-1, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // {255}
-1, // token*
121, // digit+
MIN_REDUCTION+239, // $
-1, // $NT
  }
,
{ // state 85
99,286, // "t"
  }
,
{ // state 86
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 87
104,307, // "h"
  }
,
{ // state 88
0x80000000|1, // match move
0x80000000|159, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 89
111,241, // "="
  }
,
{ // state 90
106,281, // "r"
  }
,
{ // state 91
150,MIN_REDUCTION+0, // $
  }
,
{ // state 92
2,215, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 93
2,312, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 94
0x80000000|1, // match move
0x80000000|203, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 95
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 96
97,9, // "n"
105,259, // "f"
  }
,
{ // state 97
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 98
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 99
91,293, // "a"
  }
,
{ // state 100
0x80000000|1, // match move
0x80000000|126, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 101
111,130, // "="
  }
,
{ // state 102
-1, // $$start
-1, // start
-1, // white*
3, // $$0
115, // token
212, // `boolean
142, // `class
107, // `extends
148, // `void
111, // `int
252, // `while
204, // `if
161, // `else
290, // `for
97, // `break
278, // `this
154, // `false
11, // `true
194, // `super
302, // `null
217, // `return
36, // `instanceof
168, // `new
289, // `abstract
57, // `assert
179, // `byte
16, // `case
13, // `catch
158, // `char
15, // `const
56, // `continue
234, // `default
250, // `do
216, // `double
226, // `enum
225, // `final
296, // `finally
104, // `float
205, // `goto
310, // `implements
164, // `import
47, // `interface
27, // `long
71, // `native
49, // `package
62, // `private
272, // `protected
18, // `public
308, // `short
295, // `static
300, // `strictfp
72, // `switch
125, // `synchronized
65, // `throw
187, // `throws
149, // `transient
6, // `try
112, // `volatile
131, // `!
231, // `!=
253, // `%
228, // `&&
209, // `*
50, // `(
288, // `)
145, // `{
141, // `}
20, // `-
123, // `+
251, // `=
25, // `==
263, // `[
287, // `]
246, // `||
185, // `<
309, // `<=
230, // `,
48, // `>
26, // `>=
51, // `.
218, // `;
170, // `++
207, // `--
79, // `/
30, // `:
83, // ID
14, // INT_LITERAL
197, // STRING_LITERAL
275, // CHARACTER_LITERAL
35, // "c"
-1, // "l"
-1, // "a"
156, // "s"
-1, // idChar
24, // "e"
235, // "b"
-1, // "o"
291, // "n"
-1, // "x"
128, // "t"
-1, // "d"
182, // "v"
96, // "i"
87, // "w"
-1, // "h"
265, // "f"
167, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
23, // "!"
233, // "="
82, // "+"
110, // "%"
39, // "&"
178, // "*"
249, // "("
76, // ")"
232, // "{"
144, // "}"
299, // "-"
53, // "["
127, // "]"
116, // "|"
105, // "<"
146, // ","
201, // ">"
254, // ":"
54, // "."
195, // ";"
92, // "/"
28, // digit++
106, // sq
80, // "'"
-1, // printable
-1, // letter
267, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
184, // {"0".."9"}
258, // white
245, // " "
245, // {9 12}
8, // eol
181, // {10}
74, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // {255}
84, // token*
121, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 103
139,155, // {"0".."9"}
  }
,
{ // state 104
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 105
0x80000000|101, // match move
0x80000000|60, // no-match move
// T-test match for "=":
111,
  }
,
{ // state 106
89,196, // "c"
90,196, // "l"
91,196, // "a"
92,196, // "s"
94,196, // "e"
95,196, // "b"
96,196, // "o"
97,196, // "n"
98,196, // "x"
99,196, // "t"
100,196, // "d"
101,196, // "v"
102,196, // "i"
103,196, // "w"
104,196, // "h"
105,196, // "f"
106,196, // "r"
107,196, // "k"
108,196, // "u"
109,196, // "p"
110,196, // "!"
111,196, // "="
112,196, // "+"
113,196, // "%"
114,196, // "&"
115,196, // "*"
116,196, // "("
117,196, // ")"
118,196, // "{"
119,196, // "}"
120,196, // "-"
121,196, // "["
122,196, // "]"
123,196, // "|"
124,196, // "<"
125,196, // ","
126,196, // ">"
127,196, // ":"
128,196, // "."
129,196, // ";"
130,196, // "/"
133,196, // "'"
134,75, // printable
137,196, // "_"
138,196, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
139,196, // {"0".."9"}
141,196, // " "
146,196, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 107
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 108
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 109
0x80000000|270, // match move
0x80000000|134, // no-match move
0x80000000|103, // NT-test-match state for digit
  }
,
{ // state 110
2,210, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 111
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 112
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 113
2,95, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 114
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 116
123,274, // "|"
  }
,
{ // state 117
2,4, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 118
0x80000000|1, // match move
0x80000000|61, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 119
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 120
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 121
0x80000000|269, // match move
0x80000000|279, // no-match move
0x80000000|103, // NT-test-match state for digit
  }
,
{ // state 122
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 126
2,52, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 127
2,264, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 128
104,303, // "h"
106,239, // "r"
  }
,
{ // state 129
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 130
2,58, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 132
144,86, // {10}
  }
,
{ // state 133
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 135
2,172, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 136
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 137
91,213, // "a"
  }
,
{ // state 138
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 139
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 140
151,MIN_REDUCTION+184, // $NT
  }
,
{ // state 141
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 143
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 144
2,169, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 145
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 146
2,208, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 147
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 148
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 149
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 150
106,257, // "r"
  }
,
{ // state 151
106,88, // "r"
  }
,
{ // state 152
91,261, // "a"
  }
,
{ // state 153
94,193, // "e"
  }
,
{ // state 154
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 155
151,MIN_REDUCTION+187, // $NT
  }
,
{ // state 156
108,199, // "u"
  }
,
{ // state 157
151,MIN_REDUCTION+186, // $NT
  }
,
{ // state 158
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 159
2,190, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 160
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 161
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 162
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 163
92,45, // "s"
  }
,
{ // state 164
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 165
MIN_REDUCTION+237, // (default reduction)
  }
,
{ // state 166
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 167
94,85, // "e"
  }
,
{ // state 168
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 169
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 170
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 171
90,311, // "l"
  }
,
{ // state 172
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 173
0x80000000|1, // match move
0x80000000|68, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 174
94,43, // "e"
  }
,
{ // state 175
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 176
0x80000000|1, // match move
0x80000000|67, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 177
2,180, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 178
2,2, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 179
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 180
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 182
96,46, // "o"
  }
,
{ // state 183
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 184
0x80000000|219, // match move
0x80000000|147, // no-match move
0x80000000|103, // NT-test-match state for digit
  }
,
{ // state 185
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 186
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 187
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 188
0x80000000|1, // match move
0x80000000|318, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 189
0x80000000|1, // match move
0x80000000|31, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 190
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 191
0x80000000|1, // match move
0x80000000|78, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 192
99,316, // "t"
  }
,
{ // state 193
96,77, // "o"
  }
,
{ // state 194
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 195
2,229, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 196
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 197
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 198
90,163, // "l"
  }
,
{ // state 199
109,81, // "p"
  }
,
{ // state 200
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 201
0x80000000|262, // match move
0x80000000|240, // no-match move
// T-test match for "=":
111,
  }
,
{ // state 202
90,224, // "l"
  }
,
{ // state 203
2,200, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 204
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 205
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 206
2,301, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 207
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 208
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 209
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 210
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 211
0x80000000|132, // match move
0x80000000|247, // no-match move
// T-test match for 10:
144,
  }
,
{ // state 212
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 213
97,33, // "n"
  }
,
{ // state 214
2,162, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 215
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 216
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 219
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 220
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 221
92,176, // "s"
  }
,
{ // state 222
0x80000000|1, // match move
0x80000000|113, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 223
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 224
94,21, // "e"
  }
,
{ // state 225
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 227
0x80000000|1, // match move
0x80000000|63, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 228
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 229
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 230
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 231
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 232
2,40, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 233
0x80000000|89, // match move
0x80000000|55, // no-match move
// T-test match for "=":
111,
  }
,
{ // state 234
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 235
96,59, // "o"
106,5, // "r"
  }
,
{ // state 236
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 237
100,277, // "d"
  }
,
{ // state 238
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 239
108,32, // "u"
  }
,
{ // state 240
2,29, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 241
2,175, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 242
90,191, // "l"
  }
,
{ // state 243
97,19, // "n"
  }
,
{ // state 244
111,266, // "="
  }
,
{ // state 245
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 246
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 247
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 248
2,129, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 249
2,294, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 251
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 252
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 253
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 254
2,139, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 255
90,242, // "l"
  }
,
{ // state 256
103,66, // "w"
  }
,
{ // state 257
97,188, // "n"
  }
,
{ // state 258
MIN_REDUCTION+235, // (default reduction)
  }
,
{ // state 259
0x80000000|1, // match move
0x80000000|285, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 260
120,319, // "-"
  }
,
{ // state 261
92,10, // "s"
  }
,
{ // state 262
111,292, // "="
  }
,
{ // state 263
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 264
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 265
91,198, // "a"
96,151, // "o"
  }
,
{ // state 266
2,143, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 267
0x80000000|165, // match move
0x80000000|98, // no-match move
0x80000000|103, // NT-test-match state for digit
  }
,
{ // state 268
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 269
136,109, // digit
139,184, // {"0".."9"}
  }
,
{ // state 270
MIN_REDUCTION+238, // (default reduction)
  }
,
{ // state 271
151,MIN_REDUCTION+183, // $NT
  }
,
{ // state 272
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 273
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 274
2,136, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 275
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 276
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 277
92,94, // "s"
  }
,
{ // state 278
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 279
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 280
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 281
0x80000000|1, // match move
0x80000000|44, // no-match move
0x80000000|70, // NT-test-match state for idChar
  }
,
{ // state 282
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 283
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 284
2,223, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 285
2,37, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 286
108,150, // "u"
  }
,
{ // state 287
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 288
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 289
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 290
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 291
94,256, // "e"
108,255, // "u"
  }
,
{ // state 292
2,317, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 293
107,7, // "k"
  }
,
{ // state 294
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 295
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 296
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 297
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 298
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 299
0x80000000|260, // match move
0x80000000|214, // no-match move
// T-test match for "-":
120,
  }
,
{ // state 300
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 301
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 302
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 303
102,221, // "i"
  }
,
{ // state 304
151,MIN_REDUCTION+185, // $NT
  }
,
{ // state 305
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 306
MIN_REDUCTION+236, // (default reduction)
  }
,
{ // state 307
102,202, // "i"
  }
,
{ // state 308
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 309
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 310
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 311
94,38, // "e"
  }
,
{ // state 312
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 313
100,173, // "d"
  }
,
{ // state 314
144,297, // {10}
  }
,
{ // state 315
92,174, // "s"
  }
,
{ // state 316
94,34, // "e"
  }
,
{ // state 317
140,124, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 318
2,166, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 319
2,133, // white*
140,306, // white
141,268, // " "
142,268, // {9 12}
143,298, // eol
144,236, // {10}
145,211, // {13}
MIN_REDUCTION+176, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[320][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= start
(0<<16)+1,
// $$start ::=
(0<<16)+0,
// start ::= white* $$0
(1<<16)+2,
// start ::= white*
(1<<16)+1,
// start ::= $$0
(1<<16)+1,
// token ::= `boolean
(4<<16)+1,
// token ::= `class
(4<<16)+1,
// token ::= `extends
(4<<16)+1,
// token ::= `void
(4<<16)+1,
// token ::= `int
(4<<16)+1,
// token ::= `while
(4<<16)+1,
// token ::= `if
(4<<16)+1,
// token ::= `else
(4<<16)+1,
// token ::= `for
(4<<16)+1,
// token ::= `break
(4<<16)+1,
// token ::= `this
(4<<16)+1,
// token ::= `false
(4<<16)+1,
// token ::= `true
(4<<16)+1,
// token ::= `super
(4<<16)+1,
// token ::= `null
(4<<16)+1,
// token ::= `return
(4<<16)+1,
// token ::= `instanceof
(4<<16)+1,
// token ::= `new
(4<<16)+1,
// token ::= `abstract
(4<<16)+1,
// token ::= `assert
(4<<16)+1,
// token ::= `byte
(4<<16)+1,
// token ::= `case
(4<<16)+1,
// token ::= `catch
(4<<16)+1,
// token ::= `char
(4<<16)+1,
// token ::= `const
(4<<16)+1,
// token ::= `continue
(4<<16)+1,
// token ::= `default
(4<<16)+1,
// token ::= `do
(4<<16)+1,
// token ::= `double
(4<<16)+1,
// token ::= `enum
(4<<16)+1,
// token ::= `final
(4<<16)+1,
// token ::= `finally
(4<<16)+1,
// token ::= `float
(4<<16)+1,
// token ::= `goto
(4<<16)+1,
// token ::= `implements
(4<<16)+1,
// token ::= `import
(4<<16)+1,
// token ::= `interface
(4<<16)+1,
// token ::= `long
(4<<16)+1,
// token ::= `native
(4<<16)+1,
// token ::= `package
(4<<16)+1,
// token ::= `private
(4<<16)+1,
// token ::= `protected
(4<<16)+1,
// token ::= `public
(4<<16)+1,
// token ::= `short
(4<<16)+1,
// token ::= `static
(4<<16)+1,
// token ::= `strictfp
(4<<16)+1,
// token ::= `switch
(4<<16)+1,
// token ::= `synchronized
(4<<16)+1,
// token ::= `throw
(4<<16)+1,
// token ::= `throws
(4<<16)+1,
// token ::= `transient
(4<<16)+1,
// token ::= `try
(4<<16)+1,
// token ::= `volatile
(4<<16)+1,
// token ::= `!
(4<<16)+1,
// token ::= `!=
(4<<16)+1,
// token ::= `%
(4<<16)+1,
// token ::= `&&
(4<<16)+1,
// token ::= `*
(4<<16)+1,
// token ::= `(
(4<<16)+1,
// token ::= `)
(4<<16)+1,
// token ::= `{
(4<<16)+1,
// token ::= `}
(4<<16)+1,
// token ::= `-
(4<<16)+1,
// token ::= `+
(4<<16)+1,
// token ::= `=
(4<<16)+1,
// token ::= `==
(4<<16)+1,
// token ::= `[
(4<<16)+1,
// token ::= `]
(4<<16)+1,
// token ::= `||
(4<<16)+1,
// token ::= `<
(4<<16)+1,
// token ::= `<=
(4<<16)+1,
// token ::= `,
(4<<16)+1,
// token ::= `>
(4<<16)+1,
// token ::= `>=
(4<<16)+1,
// token ::= `.
(4<<16)+1,
// token ::= `;
(4<<16)+1,
// token ::= `++
(4<<16)+1,
// token ::= `--
(4<<16)+1,
// token ::= `/
(4<<16)+1,
// token ::= `:
(4<<16)+1,
// token ::= ID
(4<<16)+1,
// token ::= INT_LITERAL
(4<<16)+1,
// token ::= STRING_LITERAL
(4<<16)+1,
// token ::= CHARACTER_LITERAL
(4<<16)+1,
// `class ::= "c" "l" "a" "s" "s" !idChar white*
(6<<16)+6,
// `class ::= "c" "l" "a" "s" "s" !idChar
(6<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar white*
(12<<16)+5,
// `else ::= "e" "l" "s" "e" !idChar
(12<<16)+4,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar white*
(5<<16)+8,
// `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar
(5<<16)+7,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar white*
(7<<16)+8,
// `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar
(7<<16)+7,
// `void ::= "v" "o" "i" "d" !idChar white*
(8<<16)+5,
// `void ::= "v" "o" "i" "d" !idChar
(8<<16)+4,
// `int ::= "i" "n" "t" !idChar white*
(9<<16)+4,
// `int ::= "i" "n" "t" !idChar
(9<<16)+3,
// `while ::= "w" "h" "i" "l" "e" !idChar white*
(10<<16)+6,
// `while ::= "w" "h" "i" "l" "e" !idChar
(10<<16)+5,
// `if ::= "i" "f" !idChar white*
(11<<16)+3,
// `if ::= "i" "f" !idChar
(11<<16)+2,
// `for ::= "f" "o" "r" !idChar white*
(13<<16)+4,
// `for ::= "f" "o" "r" !idChar
(13<<16)+3,
// `break ::= "b" "r" "e" "a" "k" !idChar white*
(14<<16)+6,
// `break ::= "b" "r" "e" "a" "k" !idChar
(14<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar white*
(15<<16)+5,
// `this ::= "t" "h" "i" "s" !idChar
(15<<16)+4,
// `false ::= "f" "a" "l" "s" "e" !idChar white*
(16<<16)+6,
// `false ::= "f" "a" "l" "s" "e" !idChar
(16<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar white*
(17<<16)+5,
// `true ::= "t" "r" "u" "e" !idChar
(17<<16)+4,
// `super ::= "s" "u" "p" "e" "r" !idChar white*
(18<<16)+6,
// `super ::= "s" "u" "p" "e" "r" !idChar
(18<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar white*
(19<<16)+5,
// `null ::= "n" "u" "l" "l" !idChar
(19<<16)+4,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar white*
(20<<16)+7,
// `return ::= "r" "e" "t" "u" "r" "n" !idChar
(20<<16)+6,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar white*
(21<<16)+11,
// `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar
(21<<16)+10,
// `new ::= "n" "e" "w" !idChar white*
(22<<16)+4,
// `new ::= "n" "e" "w" !idChar
(22<<16)+3,
// `!= ::= "!" "=" white*
(59<<16)+3,
// `!= ::= "!" "="
(59<<16)+2,
// `+ ::= "+" !"+" white*
(68<<16)+2,
// `+ ::= "+" !"+"
(68<<16)+1,
// `! ::= "!" !"=" white*
(58<<16)+2,
// `! ::= "!" !"="
(58<<16)+1,
// `= ::= "=" !"=" white*
(69<<16)+2,
// `= ::= "=" !"="
(69<<16)+1,
// `% ::= "%" white*
(60<<16)+2,
// `% ::= "%"
(60<<16)+1,
// `&& ::= "&" "&" white*
(61<<16)+3,
// `&& ::= "&" "&"
(61<<16)+2,
// `* ::= "*" white*
(62<<16)+2,
// `* ::= "*"
(62<<16)+1,
// `( ::= "(" white*
(63<<16)+2,
// `( ::= "("
(63<<16)+1,
// `) ::= ")" white*
(64<<16)+2,
// `) ::= ")"
(64<<16)+1,
// `{ ::= "{" white*
(65<<16)+2,
// `{ ::= "{"
(65<<16)+1,
// `} ::= "}" white*
(66<<16)+2,
// `} ::= "}"
(66<<16)+1,
// `- ::= "-" !"-" white*
(67<<16)+2,
// `- ::= "-" !"-"
(67<<16)+1,
// `== ::= "=" "=" white*
(70<<16)+3,
// `== ::= "=" "="
(70<<16)+2,
// `[ ::= "[" white*
(71<<16)+2,
// `[ ::= "["
(71<<16)+1,
// `] ::= "]" white*
(72<<16)+2,
// `] ::= "]"
(72<<16)+1,
// `|| ::= "|" "|" white*
(73<<16)+3,
// `|| ::= "|" "|"
(73<<16)+2,
// `< ::= "<" !"=" white*
(74<<16)+2,
// `< ::= "<" !"="
(74<<16)+1,
// `<= ::= "<" "=" white*
(75<<16)+3,
// `<= ::= "<" "="
(75<<16)+2,
// `, ::= "," white*
(76<<16)+2,
// `, ::= ","
(76<<16)+1,
// `> ::= ">" !"=" white*
(77<<16)+2,
// `> ::= ">" !"="
(77<<16)+1,
// `>= ::= ">" "=" white*
(78<<16)+3,
// `>= ::= ">" "="
(78<<16)+2,
// `: ::= ":" white*
(84<<16)+2,
// `: ::= ":"
(84<<16)+1,
// `. ::= "." white*
(79<<16)+2,
// `. ::= "."
(79<<16)+1,
// `; ::= ";" white*
(80<<16)+2,
// `; ::= ";"
(80<<16)+1,
// `++ ::= "+" "+" white*
(81<<16)+3,
// `++ ::= "+" "+"
(81<<16)+2,
// `-- ::= "-" "-" white*
(82<<16)+3,
// `-- ::= "-" "-"
(82<<16)+2,
// `/ ::= "/" white*
(83<<16)+2,
// `/ ::= "/"
(83<<16)+1,
// INT_LITERAL ::= digit++ white*
(86<<16)+2,
// INT_LITERAL ::= digit++
(86<<16)+1,
// sq ::= "'"
(132<<16)+1,
// CHARACTER_LITERAL ::= sq printable sq
(88<<16)+3,
// idChar ::= letter
(93<<16)+1,
// idChar ::= digit
(93<<16)+1,
// idChar ::= "_"
(93<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(135<<16)+1,
// digit ::= {"0".."9"}
(136<<16)+1,
// white ::= {9 12 " "}
(140<<16)+1,
// white ::= eol
(140<<16)+1,
// eol ::= {10}
(143<<16)+1,
// eol ::= {13} {10}
(143<<16)+2,
// eol ::= {13} !10
(143<<16)+1,
// printable ::= {" ".."~"}
(134<<16)+1,
// `abstract ::= !255 {255}
(23<<16)+1,
// `assert ::= !255 {255}
(24<<16)+1,
// `byte ::= !255 {255}
(25<<16)+1,
// `case ::= !255 {255}
(26<<16)+1,
// `catch ::= !255 {255}
(27<<16)+1,
// `char ::= !255 {255}
(28<<16)+1,
// `const ::= !255 {255}
(29<<16)+1,
// `continue ::= !255 {255}
(30<<16)+1,
// `default ::= !255 {255}
(31<<16)+1,
// `do ::= !255 {255}
(32<<16)+1,
// `double ::= !255 {255}
(33<<16)+1,
// `enum ::= !255 {255}
(34<<16)+1,
// `final ::= !255 {255}
(35<<16)+1,
// `finally ::= !255 {255}
(36<<16)+1,
// `float ::= !255 {255}
(37<<16)+1,
// `goto ::= !255 {255}
(38<<16)+1,
// `implements ::= !255 {255}
(39<<16)+1,
// `import ::= !255 {255}
(40<<16)+1,
// `interface ::= !255 {255}
(41<<16)+1,
// `long ::= !255 {255}
(42<<16)+1,
// `native ::= !255 {255}
(43<<16)+1,
// `package ::= !255 {255}
(44<<16)+1,
// `private ::= !255 {255}
(45<<16)+1,
// `protected ::= !255 {255}
(46<<16)+1,
// `public ::= !255 {255}
(47<<16)+1,
// `short ::= !255 {255}
(48<<16)+1,
// `static ::= !255 {255}
(49<<16)+1,
// `strictfp ::= !255 {255}
(50<<16)+1,
// `switch ::= !255 {255}
(51<<16)+1,
// `synchronized ::= !255 {255}
(52<<16)+1,
// `throw ::= !255 {255}
(53<<16)+1,
// `throws ::= !255 {255}
(54<<16)+1,
// `transient ::= !255 {255}
(55<<16)+1,
// `try ::= !255 {255}
(56<<16)+1,
// `volatile ::= !255 {255}
(57<<16)+1,
// ID ::= !255 {255}
(85<<16)+1,
// STRING_LITERAL ::= !255 {255}
(87<<16)+1,
// CHARACTER_LITERAL ::= !255 {255}
(88<<16)+1,
// token* ::= token* token
(148<<16)+2,
// token* ::= token
(148<<16)+1,
// digit++ ::= digit+ !digit
(131<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// digit+ ::= digit
(149<<16)+1,
// digit+ ::= digit+ digit
(149<<16)+2,
// $$0 ::= token*
(3<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
142, // 9
144, // 10
-1, // 11
142, // 12
145, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
141, // " "
110, // "!"
146, // '"'
146, // "#"
146, // "$"
113, // "%"
114, // "&"
133, // "'"
116, // "("
117, // ")"
115, // "*"
112, // "+"
125, // ","
120, // "-"
128, // "."
130, // "/"
139, // "0"
139, // "1"
139, // "2"
139, // "3"
139, // "4"
139, // "5"
139, // "6"
139, // "7"
139, // "8"
139, // "9"
127, // ":"
129, // ";"
124, // "<"
111, // "="
126, // ">"
146, // "?"
146, // "@"
138, // "A"
138, // "B"
138, // "C"
138, // "D"
138, // "E"
138, // "F"
138, // "G"
138, // "H"
138, // "I"
138, // "J"
138, // "K"
138, // "L"
138, // "M"
138, // "N"
138, // "O"
138, // "P"
138, // "Q"
138, // "R"
138, // "S"
138, // "T"
138, // "U"
138, // "V"
138, // "W"
138, // "X"
138, // "Y"
138, // "Z"
121, // "["
146, // "\"
122, // "]"
146, // "^"
137, // "_"
146, // "`"
91, // "a"
95, // "b"
89, // "c"
100, // "d"
94, // "e"
105, // "f"
138, // "g"
104, // "h"
102, // "i"
138, // "j"
107, // "k"
90, // "l"
138, // "m"
97, // "n"
96, // "o"
109, // "p"
138, // "q"
106, // "r"
92, // "s"
99, // "t"
108, // "u"
101, // "v"
103, // "w"
98, // "x"
138, // "y"
138, // "z"
118, // "{"
123, // "|"
119, // "}"
146, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
-1, // 176
-1, // 177
-1, // 178
-1, // 179
-1, // 180
-1, // 181
-1, // 182
-1, // 183
-1, // 184
-1, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
-1, // 193
-1, // 194
-1, // 195
-1, // 196
-1, // 197
-1, // 198
-1, // 199
-1, // 200
-1, // 201
-1, // 202
-1, // 203
-1, // 204
-1, // 205
-1, // 206
-1, // 207
-1, // 208
-1, // 209
-1, // 210
-1, // 211
-1, // 212
-1, // 213
-1, // 214
-1, // 215
-1, // 216
-1, // 217
-1, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
-1, // 223
-1, // 224
-1, // 225
-1, // 226
-1, // 227
-1, // 228
-1, // 229
-1, // 230
-1, // 231
-1, // 232
-1, // 233
-1, // 234
-1, // 235
-1, // 236
-1, // 237
-1, // 238
-1, // 239
-1, // 240
-1, // 241
-1, // 242
-1, // 243
-1, // 244
-1, // 245
-1, // 246
-1, // 247
-1, // 248
-1, // 249
-1, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
147, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"", // 1
"", // 2
"", // 3
"", // 4
"", // 5
"", // 6
"", // 7
"", // 8
"", // 9
"", // 10
"", // 11
"", // 12
"", // 13
"", // 14
"", // 15
"", // 16
"", // 17
"", // 18
"", // 19
"", // 20
"", // 21
"", // 22
"", // 23
"", // 24
"", // 25
"", // 26
"", // 27
"", // 28
"", // 29
"", // 30
"", // 31
"", // 32
"", // 33
"", // 34
"", // 35
"", // 36
"", // 37
"", // 38
"", // 39
"", // 40
"", // 41
"", // 42
"", // 43
"", // 44
"", // 45
"", // 46
"", // 47
"", // 48
"", // 49
"", // 50
"", // 51
"", // 52
"", // 53
"", // 54
"", // 55
"", // 56
"", // 57
"", // 58
"", // 59
"", // 60
"", // 61
"", // 62
"", // 63
"", // 64
"", // 65
"", // 66
"", // 67
"", // 68
"", // 69
"", // 70
"", // 71
"", // 72
"", // 73
"", // 74
"", // 75
"", // 76
"", // 77
"", // 78
"", // 79
"", // 80
"", // 81
"", // 82
"", // 83
"", // 84
"", // 85
"", // 86
"", // 87
"", // 88
"", // 89
"", // 90
"", // 91
"", // 92
"", // 93
"", // 94
"", // 95
"", // 96
"", // 97
"", // 98
"", // 99
"", // 100
"", // 101
"", // 102
"", // 103
"", // 104
"", // 105
"", // 106
"", // 107
"", // 108
"", // 109
"", // 110
"", // 111
"", // 112
"", // 113
"", // 114
"", // 115
"", // 116
"", // 117
"", // 118
"", // 119
"", // 120
"", // 121
"", // 122
"", // 123
"", // 124
"", // 125
"", // 126
"", // 127
"", // 128
"", // 129
"", // 130
"", // 131
"", // 132
"", // 133
"", // 134
"", // 135
"", // 136
"", // 137
"", // 138
"", // 139
"", // 140
"", // 141
"", // 142
"", // 143
"", // 144
"", // 145
"", // 146
"", // 147
"", // 148
"", // 149
"", // 150
"", // 151
"", // 152
"", // 153
"", // 154
"", // 155
"", // 156
"", // 157
"", // 158
"", // 159
"", // 160
"", // 161
"", // 162
"", // 163
"", // 164
"", // 165
"", // 166
"", // 167
"", // 168
"", // 169
"", // 170
"", // 171
"", // 172
"", // 173
"", // 174
"", // 175
"", // 176
"", // 177
"", // 178
"", // 179
"", // 180
"", // 181
"", // 182
"", // 183
"", // 184
"", // 185
"", // 186
"", // 187
"", // 188
"", // 189
"", // 190
"", // 191
"", // 192
"", // 193
"", // 194
"", // 195
"", // 196
"", // 197
"", // 198
"", // 199
"", // 200
"", // 201
"", // 202
"", // 203
"", // 204
"", // 205
"", // 206
"", // 207
"", // 208
"", // 209
"", // 210
"", // 211
"", // 212
"", // 213
"", // 214
"", // 215
"", // 216
"", // 217
"", // 218
"", // 219
"", // 220
"", // 221
"", // 222
"", // 223
"", // 224
"", // 225
"", // 226
"", // 227
"", // 228
"", // 229
"", // 230
"", // 231
"token* ::= token* token", // 232
"token* ::= token* token", // 233
"digit++ ::= digit+ !digit", // 234
"white* ::= white* white", // 235
"white* ::= white* white", // 236
"digit+ ::= digit", // 237
"digit+ ::= digit+ digit", // 238
"", // 239
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // 2: start ::= white* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= white* [token*] @void
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [white*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INT_LITERAL @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRING_LITERAL @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHARACTER_LITERAL @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((83<<5)|0x5)/*methodCall:83*/,
    },
    { // 89: `class ::= "c" "l" "a" "s" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 90: `class ::= "c" "l" "a" "s" "s" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 91: `else ::= "e" "l" "s" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 92: `else ::= "e" "l" "s" "e" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 93: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 94: `boolean ::= "b" "o" "o" "l" "e" "a" "n" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 95: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 96: `extends ::= "e" "x" "t" "e" "n" "d" "s" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x3)/*popOffPushBack:7*/,
    },
    { // 97: `void ::= "v" "o" "i" "d" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 98: `void ::= "v" "o" "i" "d" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 99: `int ::= "i" "n" "t" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `int ::= "i" "n" "t" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 101: `while ::= "w" "h" "i" "l" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 102: `while ::= "w" "h" "i" "l" "e" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 103: `if ::= "i" "f" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 104: `if ::= "i" "f" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 105: `for ::= "f" "o" "r" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 106: `for ::= "f" "o" "r" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `break ::= "b" "r" "e" "a" "k" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 108: `break ::= "b" "r" "e" "a" "k" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 109: `this ::= "t" "h" "i" "s" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 110: `this ::= "t" "h" "i" "s" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 111: `false ::= "f" "a" "l" "s" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 112: `false ::= "f" "a" "l" "s" "e" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 113: `true ::= "t" "r" "u" "e" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 114: `true ::= "t" "r" "u" "e" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 115: `super ::= "s" "u" "p" "e" "r" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 116: `super ::= "s" "u" "p" "e" "r" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x3)/*popOffPushBack:5*/,
    },
    { // 117: `null ::= "n" "u" "l" "l" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 118: `null ::= "n" "u" "l" "l" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x3)/*popOffPushBack:4*/,
    },
    { // 119: `return ::= "r" "e" "t" "u" "r" "n" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 120: `return ::= "r" "e" "t" "u" "r" "n" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x3)/*popOffPushBack:6*/,
    },
    { // 121: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 122: `instanceof ::= "i" "n" "s" "t" "a" "n" "c" "e" "o" "f" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x3)/*popOffPushBack:10*/,
    },
    { // 123: `new ::= "n" "e" "w" !idChar white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 124: `new ::= "n" "e" "w" !idChar [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 125: `!= ::= "!" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 126: `!= ::= "!" "=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 127: `+ ::= "+" !"+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `+ ::= "+" !"+" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `! ::= "!" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `! ::= "!" !"=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `= ::= "=" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `= ::= "=" !"=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `% ::= "%" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `% ::= "%" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 135: `&& ::= "&" "&" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 136: `&& ::= "&" "&" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 137: `* ::= "*" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `* ::= "*" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `( ::= "(" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `( ::= "(" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `) ::= ")" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `) ::= ")" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `{ ::= "{" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `{ ::= "{" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `} ::= "}" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `} ::= "}" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `- ::= "-" !"-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `- ::= "-" !"-" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `== ::= "=" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 150: `== ::= "=" "=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 151: `[ ::= "[" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `[ ::= "[" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `] ::= "]" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `] ::= "]" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `|| ::= "|" "|" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 156: `|| ::= "|" "|" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 157: `< ::= "<" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `< ::= "<" !"=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `<= ::= "<" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 160: `<= ::= "<" "=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 161: `, ::= "," white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `, ::= "," [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `> ::= ">" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `> ::= ">" !"=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `>= ::= ">" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 166: `>= ::= ">" "=" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 167: `: ::= ":" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `: ::= ":" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `. ::= "." white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `. ::= "." [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `; ::= ";" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `; ::= ";" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `++ ::= "+" "+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 174: `++ ::= "+" "+" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 175: `-- ::= "-" "-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 176: `-- ::= "-" "-" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 177: `/ ::= "/" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `/ ::= "/" [white*] @void
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: INT_LITERAL ::= [#] digit++ white* @convertToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 180: INT_LITERAL ::= [#] digit++ [white*] @convertToInt(int,List<Character>)=>int
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 181: sq ::= "'" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 182: CHARACTER_LITERAL ::= sq printable sq @makeChar(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 183: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 184: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 185: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 186: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 187: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 188: white ::= {9 12 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 189: white ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 190: eol ::= {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 191: eol ::= {13} {10} [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 192: eol ::= {13} !10 [registerNewline] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 193: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 194: `abstract ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 195: `assert ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 196: `byte ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 197: `case ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 198: `catch ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 199: `char ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 200: `const ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 201: `continue ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 202: `default ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 203: `do ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 204: `double ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 205: `enum ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 206: `final ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 207: `finally ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 208: `float ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 209: `goto ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 210: `implements ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 211: `import ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 212: `interface ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 213: `long ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 214: `native ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 215: `package ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 216: `private ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 217: `protected ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 218: `public ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 219: `short ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 220: `static ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 221: `strictfp ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 222: `switch ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 223: `synchronized ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 224: `throw ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 225: `throws ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 226: `transient ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 227: `try ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 228: `volatile ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 229: ID ::= !255 {255} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 230: STRING_LITERAL ::= !255 {255} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 231: CHARACTER_LITERAL ::= !255 {255} @return0(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((86<<5)|0x5)/*methodCall:86*/,
    },
    { // 232: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 233: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // 234: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 235: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 236: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 237: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 238: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 239: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "", // start
    "token* ::=", // token*
    "white* ::=", // white*
    "", // $$start
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // start
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
    },
    { // token*
    },
    { // white*
    },
    { // $$start
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((87<<5)|0x5)/*methodCall:87*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBoolean(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawClass(parm0);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawExtends(parm0);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVoid(parm0);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInt(parm0);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawWhile(parm0);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawIf(parm0);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawElse(parm0);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFor(parm0);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawBreak(parm0);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThis(parm0);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFalse(parm0);
    }
    break;
    case 12: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTrue(parm0);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSuper(parm0);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNull(parm0);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawReturn(parm0);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInstanceof(parm0);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNew(parm0);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAbstract(parm0);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssert(parm0);
    }
    break;
    case 20: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawByte(parm0);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCase(parm0);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawCatch(parm0);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawChar(parm0);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawConst(parm0);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawContinue(parm0);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDefault(parm0);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDo(parm0);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDouble(parm0);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEnum(parm0);
    }
    break;
    case 30: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinal(parm0);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFinally(parm0);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawFloat(parm0);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGoto(parm0);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImplements(parm0);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawImport(parm0);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawInterface(parm0);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLong(parm0);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNative(parm0);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPackage(parm0);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPrivate(parm0);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawProtected(parm0);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPublic(parm0);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawShort(parm0);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStatic(parm0);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawStrictfp(parm0);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSwitch(parm0);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSynchronized(parm0);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrow(parm0);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawThrows(parm0);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTransient(parm0);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTry(parm0);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawVolatile(parm0);
    }
    break;
    case 53: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNot(parm0);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawNotEqual(parm0);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRemainder(parm0);
    }
    break;
    case 56: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAnd(parm0);
    }
    break;
    case 57: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawTimes(parm0);
    }
    break;
    case 58: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLpar(parm0);
    }
    break;
    case 59: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRpar(parm0);
    }
    break;
    case 60: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrace(parm0);
    }
    break;
    case 61: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrace(parm0);
    }
    break;
    case 62: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinus(parm0);
    }
    break;
    case 63: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlus(parm0);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawAssign(parm0);
    }
    break;
    case 65: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawEqual(parm0);
    }
    break;
    case 66: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLbrack(parm0);
    }
    break;
    case 67: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawRbrack(parm0);
    }
    break;
    case 68: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawOr(parm0);
    }
    break;
    case 69: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLess(parm0);
    }
    break;
    case 70: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawLessEq(parm0);
    }
    break;
    case 71: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawComma(parm0);
    }
    break;
    case 72: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreater(parm0);
    }
    break;
    case 73: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawGreaterEq(parm0);
    }
    break;
    case 74: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawDot(parm0);
    }
    break;
    case 75: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSemi(parm0);
    }
    break;
    case 76: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawPlusPlus(parm0);
    }
    break;
    case 77: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawMinusMinus(parm0);
    }
    break;
    case 78: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawSlash(parm0);
    }
    break;
    case 79: {
      int parm0 = (Integer)si.popPb();
      actionObject.sawColon(parm0);
    }
    break;
    case 80: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.identifier(parm0,parm1);
    }
    break;
    case 81: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.intLit(parm0,parm1);
    }
    break;
    case 82: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      actionObject.stringLit(parm0,parm1);
    }
    break;
    case 83: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      actionObject.charLit(parm0,parm1);
    }
    break;
    case 84: {
      int parm0 = (Integer)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 85: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.makeChar(parm0);
      si.pushPb(result);
    }
    break;
    case 86: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.return0(parm0);
      si.pushPb(result);
    }
    break;
    case 87: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void sawBoolean(int)",
"void sawClass(int)",
"void sawExtends(int)",
"void sawVoid(int)",
"void sawInt(int)",
"void sawWhile(int)",
"void sawIf(int)",
"void sawElse(int)",
"void sawFor(int)",
"void sawBreak(int)",
"void sawThis(int)",
"void sawFalse(int)",
"void sawTrue(int)",
"void sawSuper(int)",
"void sawNull(int)",
"void sawReturn(int)",
"void sawInstanceof(int)",
"void sawNew(int)",
"void sawAbstract(int)",
"void sawAssert(int)",
"void sawByte(int)",
"void sawCase(int)",
"void sawCatch(int)",
"void sawChar(int)",
"void sawConst(int)",
"void sawContinue(int)",
"void sawDefault(int)",
"void sawDo(int)",
"void sawDouble(int)",
"void sawEnum(int)",
"void sawFinal(int)",
"void sawFinally(int)",
"void sawFloat(int)",
"void sawGoto(int)",
"void sawImplements(int)",
"void sawImport(int)",
"void sawInterface(int)",
"void sawLong(int)",
"void sawNative(int)",
"void sawPackage(int)",
"void sawPrivate(int)",
"void sawProtected(int)",
"void sawPublic(int)",
"void sawShort(int)",
"void sawStatic(int)",
"void sawStrictfp(int)",
"void sawSwitch(int)",
"void sawSynchronized(int)",
"void sawThrow(int)",
"void sawThrows(int)",
"void sawTransient(int)",
"void sawTry(int)",
"void sawVolatile(int)",
"void sawNot(int)",
"void sawNotEqual(int)",
"void sawRemainder(int)",
"void sawAnd(int)",
"void sawTimes(int)",
"void sawLpar(int)",
"void sawRpar(int)",
"void sawLbrace(int)",
"void sawRbrace(int)",
"void sawMinus(int)",
"void sawPlus(int)",
"void sawAssign(int)",
"void sawEqual(int)",
"void sawLbrack(int)",
"void sawRbrack(int)",
"void sawOr(int)",
"void sawLess(int)",
"void sawLessEq(int)",
"void sawComma(int)",
"void sawGreater(int)",
"void sawGreaterEq(int)",
"void sawDot(int)",
"void sawSemi(int)",
"void sawPlusPlus(int)",
"void sawMinusMinus(int)",
"void sawSlash(int)",
"void sawColon(int)",
"void identifier(int,String)",
"void intLit(int,int)",
"void stringLit(int,String)",
"void charLit(int,int)",
"int convertToInt(int,List<Character>)",
"int makeChar(char)",
"int return0(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
1,0,
2,0,
2,0,
2,0,
2,0,
2,1,
1,1,
1,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    0,
    -1,
    1,
    1,
    1,
    -1,
    -1,
    -1,
    0,
    -1,
    -1,
    0,
    -1,
    -1,
    -1,
    -1,
    0,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.ArrayList<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}
