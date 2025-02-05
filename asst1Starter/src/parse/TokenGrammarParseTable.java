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
public int getEofSym() { return 156; }
public int getNttSym() { return 157; }
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
"255",
"\"!\"",
"\"=\"",
"\"+\"",
"\"%\"",
"\"&\"",
"\"*\"",
"\"/\"",
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
"printable*",
"start_comment",
"comment*",
"end_comment",
"comment",
"comment_builder",
"10",
"13",
"{\'\"\'..\"$\" \"?\"..\"@\" \"\\\" \"^\" \"`\" \"~\"}",
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
public int numSymbols() { return 158;}
private static final int MIN_REDUCTION = 376;
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
110, // start
124, // white*
338, // $$0
257, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
-1, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
38, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
229, // white
280, // " "
280, // {9 12}
14, // eol
-1, // printable*
86, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
209, // {10}
93, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
101, // token*
140, // digit+
MIN_REDUCTION+1, // $
-1, // $NT
  }
,
{ // state 1
96,308, // "o"
  }
,
{ // state 2
  }
,
{ // state 3
-1, // $$start
-1, // start
194, // white*
-1, // $$0
MIN_REDUCTION+120, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+120, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+120, // "s"
-1, // idChar
MIN_REDUCTION+120, // "e"
MIN_REDUCTION+120, // "b"
-1, // "o"
MIN_REDUCTION+120, // "n"
-1, // "x"
MIN_REDUCTION+120, // "t"
-1, // "d"
MIN_REDUCTION+120, // "v"
MIN_REDUCTION+120, // "i"
MIN_REDUCTION+120, // "w"
-1, // "h"
MIN_REDUCTION+120, // "f"
MIN_REDUCTION+120, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+120, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+120, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+120, // $
-1, // $NT
  }
,
{ // state 4
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 5
117,6, // "/"
  }
,
{ // state 6
89,148, // "c"
90,148, // "l"
91,148, // "a"
92,148, // "s"
94,148, // "e"
95,148, // "b"
96,148, // "o"
97,148, // "n"
98,148, // "x"
99,148, // "t"
100,148, // "d"
101,148, // "v"
102,148, // "i"
103,148, // "w"
104,148, // "h"
105,148, // "f"
106,148, // "r"
107,148, // "k"
108,148, // "u"
109,148, // "p"
111,148, // "!"
112,148, // "="
113,148, // "+"
114,148, // "%"
115,148, // "&"
116,148, // "*"
117,148, // "/"
118,148, // "("
119,148, // ")"
120,148, // "{"
121,148, // "}"
122,148, // "-"
123,148, // "["
124,148, // "]"
125,148, // "|"
126,148, // "<"
127,148, // ","
128,148, // ">"
129,148, // ":"
130,148, // "."
131,148, // ";"
134,148, // "'"
135,51, // printable
138,148, // "_"
139,148, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
140,148, // {"0".."9"}
142,148, // " "
144,195, // eol
145,144, // printable*
151,274, // {10}
152,243, // {13}
153,148, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 7
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+137, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+137, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+137, // $
-1, // $NT
  }
,
{ // state 8
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 9
0x80000000|2, // match move
0x80000000|353, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 10
100,276, // "d"
  }
,
{ // state 11
89,148, // "c"
90,148, // "l"
91,148, // "a"
92,148, // "s"
94,148, // "e"
95,148, // "b"
96,148, // "o"
97,148, // "n"
98,148, // "x"
99,148, // "t"
100,148, // "d"
101,148, // "v"
102,148, // "i"
103,148, // "w"
104,148, // "h"
105,148, // "f"
106,148, // "r"
107,148, // "k"
108,148, // "u"
109,148, // "p"
111,148, // "!"
112,148, // "="
113,148, // "+"
114,148, // "%"
115,148, // "&"
116,148, // "*"
117,148, // "/"
118,148, // "("
119,148, // ")"
120,148, // "{"
121,148, // "}"
122,148, // "-"
123,148, // "["
124,148, // "]"
125,148, // "|"
126,148, // "<"
127,148, // ","
128,148, // ">"
129,148, // ":"
130,148, // "."
131,148, // ";"
134,148, // "'"
135,330, // printable
138,148, // "_"
139,148, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
140,148, // {"0".."9"}
142,148, // " "
153,148, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 12
92,265, // "s"
  }
,
{ // state 13
2,204, // white*
141,114, // white
142,305, // " "
143,305, // {9 12}
144,346, // eol
151,274, // {10}
152,243, // {13}
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 14
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 15
0x80000000|206, // match move
0x80000000|196, // no-match move
// T-test match for "=":
112,
  }
,
{ // state 16
116,345, // "*"
147,47, // comment*
148,119, // end_comment
  }
,
{ // state 17
125,183, // "|"
  }
,
{ // state 18
108,319, // "u"
  }
,
{ // state 19
116,348, // "*"
  }
,
{ // state 20
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 21
94,248, // "e"
108,37, // "u"
  }
,
{ // state 22
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 23
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+117, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+117, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+117, // $
-1, // $NT
  }
,
{ // state 24
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 25
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 26
-1, // $$start
-1, // start
370, // white*
-1, // $$0
MIN_REDUCTION+174, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+174, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+174, // $
-1, // $NT
  }
,
{ // state 27
91,170, // "a"
96,294, // "o"
  }
,
{ // state 28
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 29
-1, // $$start
-1, // start
299, // white*
-1, // $$0
MIN_REDUCTION+162, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+162, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+162, // $
-1, // $NT
  }
,
{ // state 30
-1, // $$start
-1, // start
112, // white*
-1, // $$0
MIN_REDUCTION+90, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+90, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+90, // "s"
-1, // idChar
MIN_REDUCTION+90, // "e"
MIN_REDUCTION+90, // "b"
-1, // "o"
MIN_REDUCTION+90, // "n"
-1, // "x"
MIN_REDUCTION+90, // "t"
-1, // "d"
MIN_REDUCTION+90, // "v"
MIN_REDUCTION+90, // "i"
MIN_REDUCTION+90, // "w"
-1, // "h"
MIN_REDUCTION+90, // "f"
MIN_REDUCTION+90, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+90, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+90, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+90, // $
-1, // $NT
  }
,
{ // state 31
91,290, // "a"
  }
,
{ // state 32
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 33
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 34
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 35
-1, // $$start
-1, // start
159, // white*
-1, // $$0
MIN_REDUCTION+184, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+184, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+184, // $
-1, // $NT
  }
,
{ // state 36
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 37
90,253, // "l"
  }
,
{ // state 38
0x80000000|19, // match move
0x80000000|179, // no-match move
// T-test match for "*":
116,
  }
,
{ // state 39
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 40
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+171, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+171, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+171, // $
-1, // $NT
  }
,
{ // state 41
-1, // $$start
-1, // start
358, // white*
-1, // $$0
MIN_REDUCTION+136, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
-1, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
-1, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+136, // {255}
15, // "!"
212, // "="
MIN_REDUCTION+136, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+136, // $
-1, // $NT
  }
,
{ // state 42
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 43
-1, // $$start
-1, // start
316, // white*
-1, // $$0
MIN_REDUCTION+98, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+98, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+98, // "s"
-1, // idChar
MIN_REDUCTION+98, // "e"
MIN_REDUCTION+98, // "b"
-1, // "o"
MIN_REDUCTION+98, // "n"
-1, // "x"
MIN_REDUCTION+98, // "t"
-1, // "d"
MIN_REDUCTION+98, // "v"
MIN_REDUCTION+98, // "i"
MIN_REDUCTION+98, // "w"
-1, // "h"
MIN_REDUCTION+98, // "f"
MIN_REDUCTION+98, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+98, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+98, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+98, // $
-1, // $NT
  }
,
{ // state 44
116,345, // "*"
148,288, // end_comment
  }
,
{ // state 45
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 46
-1, // $$start
-1, // start
56, // white*
-1, // $$0
MIN_REDUCTION+166, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
-1, // `=
-1, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+166, // {255}
15, // "!"
MIN_REDUCTION+166, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+166, // $
-1, // $NT
  }
,
{ // state 47
0x80000000|44, // match move
0x80000000|64, // no-match move
0x80000000|328, // NT-test-match state for end_comment
  }
,
{ // state 48
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+103, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+103, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+103, // $
-1, // $NT
  }
,
{ // state 49
-1, // $$start
-1, // start
326, // white*
-1, // $$0
MIN_REDUCTION+178, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+178, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+178, // $
-1, // $NT
  }
,
{ // state 50
102,105, // "i"
  }
,
{ // state 51
MIN_REDUCTION+244, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 53
-1, // $$start
-1, // start
55, // white*
-1, // $$0
MIN_REDUCTION+152, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+152, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+152, // $
-1, // $NT
  }
,
{ // state 54
92,216, // "s"
  }
,
{ // state 55
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+151, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+151, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+151, // $
-1, // $NT
  }
,
{ // state 56
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+165, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+165, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+165, // $
-1, // $NT
  }
,
{ // state 57
MIN_REDUCTION+240, // (default reduction)
  }
,
{ // state 58
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 59
112,118, // "="
  }
,
{ // state 60
97,321, // "n"
  }
,
{ // state 61
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 62
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 63
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 64
89,148, // "c"
90,148, // "l"
91,148, // "a"
92,148, // "s"
94,148, // "e"
95,148, // "b"
96,148, // "o"
97,148, // "n"
98,148, // "x"
99,148, // "t"
100,148, // "d"
101,148, // "v"
102,148, // "i"
103,148, // "w"
104,148, // "h"
105,148, // "f"
106,148, // "r"
107,148, // "k"
108,148, // "u"
109,148, // "p"
111,148, // "!"
112,148, // "="
113,148, // "+"
114,148, // "%"
115,148, // "&"
116,148, // "*"
117,148, // "/"
118,148, // "("
119,148, // ")"
120,148, // "{"
121,148, // "}"
122,148, // "-"
123,148, // "["
124,148, // "]"
125,148, // "|"
126,148, // "<"
127,148, // ","
128,148, // ">"
129,148, // ":"
130,148, // "."
131,148, // ";"
134,148, // "'"
135,51, // printable
138,148, // "_"
139,148, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
140,148, // {"0".."9"}
142,148, // " "
144,52, // eol
145,11, // printable*
149,156, // comment
150,337, // comment_builder
151,369, // {10}
152,270, // {13}
153,148, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 65
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 66
-1, // $$start
-1, // start
23, // white*
-1, // $$0
MIN_REDUCTION+118, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+118, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+118, // "s"
-1, // idChar
MIN_REDUCTION+118, // "e"
MIN_REDUCTION+118, // "b"
-1, // "o"
MIN_REDUCTION+118, // "n"
-1, // "x"
MIN_REDUCTION+118, // "t"
-1, // "d"
MIN_REDUCTION+118, // "v"
MIN_REDUCTION+118, // "i"
MIN_REDUCTION+118, // "w"
-1, // "h"
MIN_REDUCTION+118, // "f"
MIN_REDUCTION+118, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+118, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+118, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+118, // $
-1, // $NT
  }
,
{ // state 67
0x80000000|2, // match move
0x80000000|104, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 68
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+121, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+121, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+121, // $
-1, // $NT
  }
,
{ // state 69
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 70
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 71
0x80000000|2, // match move
0x80000000|317, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 72
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+167, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+167, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+167, // $
-1, // $NT
  }
,
{ // state 73
-1, // $$start
-1, // start
137, // white*
-1, // $$0
MIN_REDUCTION+100, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+100, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+100, // "s"
-1, // idChar
MIN_REDUCTION+100, // "e"
MIN_REDUCTION+100, // "b"
-1, // "o"
MIN_REDUCTION+100, // "n"
-1, // "x"
MIN_REDUCTION+100, // "t"
-1, // "d"
MIN_REDUCTION+100, // "v"
MIN_REDUCTION+100, // "i"
MIN_REDUCTION+100, // "w"
-1, // "h"
MIN_REDUCTION+100, // "f"
MIN_REDUCTION+100, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+100, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+100, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+100, // $
-1, // $NT
  }
,
{ // state 74
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 75
-1, // $$start
-1, // start
277, // white*
-1, // $$0
MIN_REDUCTION+110, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+110, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+110, // "s"
-1, // idChar
MIN_REDUCTION+110, // "e"
MIN_REDUCTION+110, // "b"
-1, // "o"
MIN_REDUCTION+110, // "n"
-1, // "x"
MIN_REDUCTION+110, // "t"
-1, // "d"
MIN_REDUCTION+110, // "v"
MIN_REDUCTION+110, // "i"
MIN_REDUCTION+110, // "w"
-1, // "h"
MIN_REDUCTION+110, // "f"
MIN_REDUCTION+110, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+110, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+110, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+110, // $
-1, // $NT
  }
,
{ // state 76
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 78
0x80000000|2, // match move
0x80000000|107, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 79
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 80
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 81
0x80000000|2, // match move
0x80000000|236, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 82
94,92, // "e"
  }
,
{ // state 83
115,169, // "&"
  }
,
{ // state 84
-1, // $$start
-1, // start
241, // white*
-1, // $$0
MIN_REDUCTION+142, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+142, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+142, // $
-1, // $NT
  }
,
{ // state 85
0x80000000|99, // match move
0x80000000|41, // no-match move
// T-test match for "+":
113,
  }
,
{ // state 86
0x80000000|163, // match move
0x80000000|351, // no-match move
0x80000000|328, // NT-test-match state for end_comment
  }
,
{ // state 87
90,226, // "l"
  }
,
{ // state 88
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 89
89,185, // "c"
90,185, // "l"
91,185, // "a"
92,185, // "s"
94,185, // "e"
95,185, // "b"
96,185, // "o"
97,185, // "n"
98,185, // "x"
99,185, // "t"
100,185, // "d"
101,185, // "v"
102,185, // "i"
103,185, // "w"
104,185, // "h"
105,185, // "f"
106,185, // "r"
107,185, // "k"
108,185, // "u"
109,185, // "p"
136,309, // letter
137,167, // digit
138,356, // "_"
139,185, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
140,182, // {"0".."9"}
  }
,
{ // state 90
0x80000000|2, // match move
0x80000000|251, // no-match move
// T-test match for "/":
117,
  }
,
{ // state 91
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 92
0x80000000|2, // match move
0x80000000|329, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 93
0x80000000|368, // match move
0x80000000|79, // no-match move
// T-test match for 10:
151,
  }
,
{ // state 94
0x80000000|2, // match move
0x80000000|213, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 95
133,325, // sq
134,324, // "'"
  }
,
{ // state 96
117,343, // "/"
  }
,
{ // state 97
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 98
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 99
113,327, // "+"
  }
,
{ // state 100
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 101
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
57, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
-1, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
332, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
-1, // white
-1, // " "
-1, // {9 12}
-1, // eol
-1, // printable*
-1, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
-1, // {10}
-1, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+251, // $
-1, // $NT
  }
,
{ // state 102
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 103
94,366, // "e"
  }
,
{ // state 104
-1, // $$start
-1, // start
142, // white*
-1, // $$0
MIN_REDUCTION+114, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+114, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+114, // "s"
-1, // idChar
MIN_REDUCTION+114, // "e"
MIN_REDUCTION+114, // "b"
-1, // "o"
MIN_REDUCTION+114, // "n"
-1, // "x"
MIN_REDUCTION+114, // "t"
-1, // "d"
MIN_REDUCTION+114, // "v"
MIN_REDUCTION+114, // "i"
MIN_REDUCTION+114, // "w"
-1, // "h"
MIN_REDUCTION+114, // "f"
MIN_REDUCTION+114, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+114, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+114, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+114, // $
-1, // $NT
  }
,
{ // state 105
92,278, // "s"
  }
,
{ // state 106
116,128, // "*"
148,237, // end_comment
  }
,
{ // state 107
-1, // $$start
-1, // start
139, // white*
-1, // $$0
MIN_REDUCTION+116, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+116, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+116, // "s"
-1, // idChar
MIN_REDUCTION+116, // "e"
MIN_REDUCTION+116, // "b"
-1, // "o"
MIN_REDUCTION+116, // "n"
-1, // "x"
MIN_REDUCTION+116, // "t"
-1, // "d"
MIN_REDUCTION+116, // "v"
MIN_REDUCTION+116, // "i"
MIN_REDUCTION+116, // "w"
-1, // "h"
MIN_REDUCTION+116, // "f"
MIN_REDUCTION+116, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+116, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+116, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+116, // $
-1, // $NT
  }
,
{ // state 108
-1, // $$start
-1, // start
230, // white*
-1, // $$0
MIN_REDUCTION+96, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+96, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+96, // "s"
-1, // idChar
MIN_REDUCTION+96, // "e"
MIN_REDUCTION+96, // "b"
-1, // "o"
MIN_REDUCTION+96, // "n"
-1, // "x"
MIN_REDUCTION+96, // "t"
-1, // "d"
MIN_REDUCTION+96, // "v"
MIN_REDUCTION+96, // "i"
MIN_REDUCTION+96, // "w"
-1, // "h"
MIN_REDUCTION+96, // "f"
MIN_REDUCTION+96, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+96, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+96, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+96, // $
-1, // $NT
  }
,
{ // state 109
105,180, // "f"
  }
,
{ // state 110
156,MIN_REDUCTION+0, // $
  }
,
{ // state 111
-1, // $$start
-1, // start
219, // white*
-1, // $$0
MIN_REDUCTION+106, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+106, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+106, // "s"
-1, // idChar
MIN_REDUCTION+106, // "e"
MIN_REDUCTION+106, // "b"
-1, // "o"
MIN_REDUCTION+106, // "n"
-1, // "x"
MIN_REDUCTION+106, // "t"
-1, // "d"
MIN_REDUCTION+106, // "v"
MIN_REDUCTION+106, // "i"
MIN_REDUCTION+106, // "w"
-1, // "h"
MIN_REDUCTION+106, // "f"
MIN_REDUCTION+106, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+106, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+106, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+106, // $
-1, // $NT
  }
,
{ // state 112
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+89, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+89, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+89, // $
-1, // $NT
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 113
104,50, // "h"
106,201, // "r"
  }
,
{ // state 114
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 115
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 116
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 117
-1, // $$start
-1, // start
68, // white*
-1, // $$0
MIN_REDUCTION+122, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+122, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+122, // "s"
-1, // idChar
MIN_REDUCTION+122, // "e"
MIN_REDUCTION+122, // "b"
-1, // "o"
MIN_REDUCTION+122, // "n"
-1, // "x"
MIN_REDUCTION+122, // "t"
-1, // "d"
MIN_REDUCTION+122, // "v"
MIN_REDUCTION+122, // "i"
MIN_REDUCTION+122, // "w"
-1, // "h"
MIN_REDUCTION+122, // "f"
MIN_REDUCTION+122, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+122, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+122, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+122, // $
-1, // $NT
  }
,
{ // state 118
-1, // $$start
-1, // start
205, // white*
-1, // $$0
MIN_REDUCTION+158, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+158, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+158, // $
-1, // $NT
  }
,
{ // state 119
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 120
140,182, // {"0".."9"}
  }
,
{ // state 121
89,357, // "c"
  }
,
{ // state 122
112,363, // "="
  }
,
{ // state 123
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 124
-1, // $$start
-1, // start
-1, // white*
4, // $$0
257, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
-1, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
38, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
291, // white
280, // " "
280, // {9 12}
14, // eol
-1, // printable*
86, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
209, // {10}
93, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
101, // token*
140, // digit+
MIN_REDUCTION+3, // $
-1, // $NT
  }
,
{ // state 125
89,224, // "c"
90,224, // "l"
91,224, // "a"
92,224, // "s"
94,224, // "e"
95,224, // "b"
96,224, // "o"
97,224, // "n"
98,224, // "x"
99,224, // "t"
100,224, // "d"
101,224, // "v"
102,224, // "i"
103,224, // "w"
104,224, // "h"
105,224, // "f"
106,224, // "r"
107,224, // "k"
108,224, // "u"
109,224, // "p"
111,224, // "!"
112,224, // "="
113,224, // "+"
114,224, // "%"
115,224, // "&"
116,224, // "*"
117,224, // "/"
118,224, // "("
119,224, // ")"
120,224, // "{"
121,224, // "}"
122,224, // "-"
123,224, // "["
124,224, // "]"
125,224, // "|"
126,224, // "<"
127,224, // ","
128,224, // ">"
129,224, // ":"
130,224, // "."
131,224, // ";"
134,224, // "'"
135,95, // printable
138,224, // "_"
139,224, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
140,224, // {"0".."9"}
142,224, // " "
153,224, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 126
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 127
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+149, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+149, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+149, // $
-1, // $NT
  }
,
{ // state 128
117,287, // "/"
  }
,
{ // state 129
0x80000000|307, // match move
0x80000000|157, // no-match move
0x80000000|120, // NT-test-match state for digit
  }
,
{ // state 130
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 131
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 133
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+181, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+181, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+181, // $
-1, // $NT
  }
,
{ // state 134
0x80000000|2, // match move
0x80000000|153, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 135
0x80000000|2, // match move
0x80000000|108, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 136
0x80000000|2, // match move
0x80000000|73, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 137
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+99, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+99, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+99, // $
-1, // $NT
  }
,
{ // state 138
96,1, // "o"
106,141, // "r"
  }
,
{ // state 139
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+115, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+115, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+115, // $
-1, // $NT
  }
,
{ // state 140
0x80000000|306, // match move
0x80000000|323, // no-match move
0x80000000|120, // NT-test-match state for digit
  }
,
{ // state 141
94,372, // "e"
  }
,
{ // state 142
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+113, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+113, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+113, // $
-1, // $NT
  }
,
{ // state 143
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 144
89,148, // "c"
90,148, // "l"
91,148, // "a"
92,148, // "s"
94,148, // "e"
95,148, // "b"
96,148, // "o"
97,148, // "n"
98,148, // "x"
99,148, // "t"
100,148, // "d"
101,148, // "v"
102,148, // "i"
103,148, // "w"
104,148, // "h"
105,148, // "f"
106,148, // "r"
107,148, // "k"
108,148, // "u"
109,148, // "p"
111,148, // "!"
112,148, // "="
113,148, // "+"
114,148, // "%"
115,148, // "&"
116,148, // "*"
117,148, // "/"
118,148, // "("
119,148, // ")"
120,148, // "{"
121,148, // "}"
122,148, // "-"
123,148, // "["
124,148, // "]"
125,148, // "|"
126,148, // "<"
127,148, // ","
128,148, // ">"
129,148, // ":"
130,148, // "."
131,148, // ";"
134,148, // "'"
135,330, // printable
138,148, // "_"
139,148, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
140,148, // {"0".."9"}
142,148, // " "
144,74, // eol
151,274, // {10}
152,243, // {13}
153,148, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 145
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 146
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 147
0x80000000|16, // match move
0x80000000|174, // no-match move
0x80000000|328, // NT-test-match state for end_comment
  }
,
{ // state 148
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 149
94,31, // "e"
  }
,
{ // state 150
0x80000000|2, // match move
0x80000000|111, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 151
151,77, // {10}
  }
,
{ // state 152
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+143, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+143, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+143, // $
-1, // $NT
  }
,
{ // state 153
-1, // $$start
-1, // start
208, // white*
-1, // $$0
MIN_REDUCTION+102, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+102, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+102, // "s"
-1, // idChar
MIN_REDUCTION+102, // "e"
MIN_REDUCTION+102, // "b"
-1, // "o"
MIN_REDUCTION+102, // "n"
-1, // "x"
MIN_REDUCTION+102, // "t"
-1, // "d"
MIN_REDUCTION+102, // "v"
MIN_REDUCTION+102, // "i"
MIN_REDUCTION+102, // "w"
-1, // "h"
MIN_REDUCTION+102, // "f"
MIN_REDUCTION+102, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+102, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+102, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+102, // $
-1, // $NT
  }
,
{ // state 154
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 155
151,102, // {10}
  }
,
{ // state 156
MIN_REDUCTION+247, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 158
0x80000000|2, // match move
0x80000000|225, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 159
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+183, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+183, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+183, // $
-1, // $NT
  }
,
{ // state 160
-1, // $$start
-1, // start
342, // white*
-1, // $$0
MIN_REDUCTION+148, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+148, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+148, // $
-1, // $NT
  }
,
{ // state 161
102,87, // "i"
  }
,
{ // state 162
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+163, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+163, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+163, // $
-1, // $NT
  }
,
{ // state 163
116,128, // "*"
147,284, // comment*
148,220, // end_comment
  }
,
{ // state 164
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 165
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+175, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+175, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+175, // $
-1, // $NT
  }
,
{ // state 166
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 167
157,MIN_REDUCTION+194, // $NT
  }
,
{ // state 168
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 169
-1, // $$start
-1, // start
152, // white*
-1, // $$0
MIN_REDUCTION+144, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+144, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+144, // $
-1, // $NT
  }
,
{ // state 170
90,339, // "l"
  }
,
{ // state 171
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+133, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+133, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+133, // $
-1, // $NT
  }
,
{ // state 172
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 173
-1, // $$start
-1, // start
171, // white*
-1, // $$0
MIN_REDUCTION+134, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+134, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+134, // $
-1, // $NT
  }
,
{ // state 174
89,148, // "c"
90,148, // "l"
91,148, // "a"
92,148, // "s"
94,148, // "e"
95,148, // "b"
96,148, // "o"
97,148, // "n"
98,148, // "x"
99,148, // "t"
100,148, // "d"
101,148, // "v"
102,148, // "i"
103,148, // "w"
104,148, // "h"
105,148, // "f"
106,148, // "r"
107,148, // "k"
108,148, // "u"
109,148, // "p"
111,148, // "!"
112,148, // "="
113,148, // "+"
114,148, // "%"
115,148, // "&"
116,148, // "*"
117,148, // "/"
118,148, // "("
119,148, // ")"
120,148, // "{"
121,148, // "}"
122,148, // "-"
123,148, // "["
124,148, // "]"
125,148, // "|"
126,148, // "<"
127,148, // ","
128,148, // ">"
129,148, // ":"
130,148, // "."
131,148, // ";"
134,148, // "'"
135,51, // printable
138,148, // "_"
139,148, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
140,148, // {"0".."9"}
142,148, // " "
144,52, // eol
145,11, // printable*
147,47, // comment*
149,235, // comment
150,337, // comment_builder
151,369, // {10}
152,270, // {13}
153,148, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 175
90,295, // "l"
  }
,
{ // state 176
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 177
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 179
0x80000000|311, // match move
0x80000000|251, // no-match move
// T-test match for "/":
117,
  }
,
{ // state 180
0x80000000|2, // match move
0x80000000|117, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 181
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 182
157,MIN_REDUCTION+197, // $NT
  }
,
{ // state 183
-1, // $$start
-1, // start
162, // white*
-1, // $$0
MIN_REDUCTION+164, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+164, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+164, // $
-1, // $NT
  }
,
{ // state 184
89,148, // "c"
90,148, // "l"
91,148, // "a"
92,148, // "s"
94,148, // "e"
95,148, // "b"
96,148, // "o"
97,148, // "n"
98,148, // "x"
99,148, // "t"
100,148, // "d"
101,148, // "v"
102,148, // "i"
103,148, // "w"
104,148, // "h"
105,148, // "f"
106,148, // "r"
107,148, // "k"
108,148, // "u"
109,148, // "p"
111,148, // "!"
112,148, // "="
113,148, // "+"
114,148, // "%"
115,148, // "&"
116,148, // "*"
117,148, // "/"
118,148, // "("
119,148, // ")"
120,148, // "{"
121,148, // "}"
122,148, // "-"
123,148, // "["
124,148, // "]"
125,148, // "|"
126,148, // "<"
127,148, // ","
128,148, // ">"
129,148, // ":"
130,148, // "."
131,148, // ";"
134,148, // "'"
135,51, // printable
138,148, // "_"
139,148, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
140,148, // {"0".."9"}
142,148, // " "
144,131, // eol
145,292, // printable*
151,209, // {10}
152,93, // {13}
153,148, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 185
157,MIN_REDUCTION+196, // $NT
  }
,
{ // state 186
99,313, // "t"
  }
,
{ // state 187
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 189
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+155, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+155, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+155, // $
-1, // $NT
  }
,
{ // state 190
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+111, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+111, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+111, // $
-1, // $NT
  }
,
{ // state 191
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 192
0x80000000|232, // match move
0x80000000|223, // no-match move
// T-test match for "-":
122,
  }
,
{ // state 193
MIN_REDUCTION+249, // (default reduction)
  }
,
{ // state 194
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+119, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+119, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+119, // $
-1, // $NT
  }
,
{ // state 195
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 196
-1, // $$start
-1, // start
7, // white*
-1, // $$0
MIN_REDUCTION+138, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
-1, // `=
-1, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+138, // {255}
15, // "!"
MIN_REDUCTION+138, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+138, // $
-1, // $NT
  }
,
{ // state 197
92,135, // "s"
  }
,
{ // state 198
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 199
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 200
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+153, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+153, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+153, // $
-1, // $NT
  }
,
{ // state 201
108,365, // "u"
  }
,
{ // state 202
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+107, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+107, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+107, // $
-1, // $NT
  }
,
{ // state 203
97,121, // "n"
  }
,
{ // state 204
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+145, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+145, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+145, // $
-1, // $NT
  }
,
{ // state 205
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+157, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+157, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+157, // $
-1, // $NT
  }
,
{ // state 206
112,173, // "="
  }
,
{ // state 207
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 208
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+101, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+101, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+101, // $
-1, // $NT
  }
,
{ // state 209
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 210
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+139, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+139, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+139, // $
-1, // $NT
  }
,
{ // state 211
0x80000000|250, // match move
0x80000000|176, // no-match move
0x80000000|120, // NT-test-match state for digit
  }
,
{ // state 212
0x80000000|59, // match move
0x80000000|301, // no-match move
// T-test match for "=":
112,
  }
,
{ // state 213
-1, // $$start
-1, // start
349, // white*
-1, // $$0
MIN_REDUCTION+94, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+94, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+94, // "s"
-1, // idChar
MIN_REDUCTION+94, // "e"
MIN_REDUCTION+94, // "b"
-1, // "o"
MIN_REDUCTION+94, // "n"
-1, // "x"
MIN_REDUCTION+94, // "t"
-1, // "d"
MIN_REDUCTION+94, // "v"
MIN_REDUCTION+94, // "i"
MIN_REDUCTION+94, // "w"
-1, // "h"
MIN_REDUCTION+94, // "f"
MIN_REDUCTION+94, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+94, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+94, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+94, // $
-1, // $NT
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 214
94,60, // "e"
  }
,
{ // state 215
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 216
0x80000000|2, // match move
0x80000000|30, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 217
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 218
107,158, // "k"
  }
,
{ // state 219
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+105, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+105, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+105, // $
-1, // $NT
  }
,
{ // state 220
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 221
0x80000000|5, // match move
0x80000000|251, // no-match move
// T-test match for "/":
117,
  }
,
{ // state 222
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 223
-1, // $$start
-1, // start
189, // white*
-1, // $$0
MIN_REDUCTION+156, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
-1, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
-1, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+156, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
MIN_REDUCTION+156, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+156, // $
-1, // $NT
  }
,
{ // state 224
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 225
-1, // $$start
-1, // start
202, // white*
-1, // $$0
MIN_REDUCTION+108, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+108, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+108, // "s"
-1, // idChar
MIN_REDUCTION+108, // "e"
MIN_REDUCTION+108, // "b"
-1, // "o"
MIN_REDUCTION+108, // "n"
-1, // "x"
MIN_REDUCTION+108, // "t"
-1, // "d"
MIN_REDUCTION+108, // "v"
MIN_REDUCTION+108, // "i"
MIN_REDUCTION+108, // "w"
-1, // "h"
MIN_REDUCTION+108, // "f"
MIN_REDUCTION+108, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+108, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+108, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+108, // $
-1, // $NT
  }
,
{ // state 226
94,134, // "e"
  }
,
{ // state 227
-1, // $$start
-1, // start
200, // white*
-1, // $$0
MIN_REDUCTION+154, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+154, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+154, // $
-1, // $NT
  }
,
{ // state 228
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 229
MIN_REDUCTION+246, // (default reduction)
  }
,
{ // state 230
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+95, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+95, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+95, // $
-1, // $NT
  }
,
{ // state 231
96,322, // "o"
  }
,
{ // state 232
122,35, // "-"
  }
,
{ // state 233
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 234
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 235
MIN_REDUCTION+248, // (default reduction)
  }
,
{ // state 236
-1, // $$start
-1, // start
364, // white*
-1, // $$0
MIN_REDUCTION+124, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+124, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+124, // "s"
-1, // idChar
MIN_REDUCTION+124, // "e"
MIN_REDUCTION+124, // "b"
-1, // "o"
MIN_REDUCTION+124, // "n"
-1, // "x"
MIN_REDUCTION+124, // "t"
-1, // "d"
MIN_REDUCTION+124, // "v"
MIN_REDUCTION+124, // "i"
MIN_REDUCTION+124, // "w"
-1, // "h"
MIN_REDUCTION+124, // "f"
MIN_REDUCTION+124, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+124, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+124, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+124, // $
-1, // $NT
  }
,
{ // state 237
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 238
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 239
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+169, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+169, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+169, // $
-1, // $NT
  }
,
{ // state 240
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 241
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+141, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+141, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+141, // $
-1, // $NT
  }
,
{ // state 242
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 243
0x80000000|155, // match move
0x80000000|282, // no-match move
// T-test match for 10:
151,
  }
,
{ // state 244
99,18, // "t"
  }
,
{ // state 245
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 246
94,244, // "e"
  }
,
{ // state 247
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 248
103,81, // "w"
  }
,
{ // state 249
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 250
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 251
2,310, // white*
141,114, // white
142,305, // " "
143,305, // {9 12}
144,346, // eol
151,274, // {10}
152,243, // {13}
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 252
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+159, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+159, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+159, // $
-1, // $NT
  }
,
{ // state 253
90,300, // "l"
  }
,
{ // state 254
0x80000000|371, // match move
0x80000000|258, // no-match move
// T-test match for "=":
112,
  }
,
{ // state 255
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 256
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+91, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+91, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+91, // $
-1, // $NT
  }
,
{ // state 257
MIN_REDUCTION+241, // (default reduction)
  }
,
{ // state 258
-1, // $$start
-1, // start
40, // white*
-1, // $$0
MIN_REDUCTION+172, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
-1, // `=
-1, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+172, // {255}
15, // "!"
MIN_REDUCTION+172, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+172, // $
-1, // $NT
  }
,
{ // state 259
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 260
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 261
109,103, // "p"
  }
,
{ // state 262
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 263
-1, // $$start
-1, // start
252, // white*
-1, // $$0
MIN_REDUCTION+160, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+160, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+160, // $
-1, // $NT
  }
,
{ // state 264
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+179, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+179, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+179, // $
-1, // $NT
  }
,
{ // state 265
94,9, // "e"
  }
,
{ // state 266
92,54, // "s"
  }
,
{ // state 267
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 268
96,109, // "o"
  }
,
{ // state 269
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 270
0x80000000|151, // match move
0x80000000|374, // no-match move
// T-test match for 10:
151,
  }
,
{ // state 271
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 272
-1, // $$start
-1, // start
165, // white*
-1, // $$0
MIN_REDUCTION+176, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+176, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+176, // $
-1, // $NT
  }
,
{ // state 273
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 274
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 275
97,367, // "n"
  }
,
{ // state 276
0x80000000|2, // match move
0x80000000|43, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 277
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+109, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+109, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+109, // $
-1, // $NT
  }
,
{ // state 278
0x80000000|2, // match move
0x80000000|75, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 279
90,12, // "l"
98,303, // "x"
  }
,
{ // state 280
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 281
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 283
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 284
0x80000000|106, // match move
0x80000000|64, // no-match move
0x80000000|328, // NT-test-match state for end_comment
  }
,
{ // state 285
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 286
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 287
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 288
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 289
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 290
97,94, // "n"
  }
,
{ // state 291
MIN_REDUCTION+245, // (default reduction)
  }
,
{ // state 292
89,148, // "c"
90,148, // "l"
91,148, // "a"
92,148, // "s"
94,148, // "e"
95,148, // "b"
96,148, // "o"
97,148, // "n"
98,148, // "x"
99,148, // "t"
100,148, // "d"
101,148, // "v"
102,148, // "i"
103,148, // "w"
104,148, // "h"
105,148, // "f"
106,148, // "r"
107,148, // "k"
108,148, // "u"
109,148, // "p"
111,148, // "!"
112,148, // "="
113,148, // "+"
114,148, // "%"
115,148, // "&"
116,148, // "*"
117,148, // "/"
118,148, // "("
119,148, // ")"
120,148, // "{"
121,148, // "}"
122,148, // "-"
123,148, // "["
124,148, // "]"
125,148, // "|"
126,148, // "<"
127,148, // ","
128,148, // ">"
129,148, // ":"
130,148, // "."
131,148, // ";"
134,148, // "'"
135,330, // printable
138,148, // "_"
139,148, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
140,148, // {"0".."9"}
142,148, // " "
144,269, // eol
151,209, // {10}
152,93, // {13}
153,148, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 293
-1, // $$start
-1, // start
127, // white*
-1, // $$0
MIN_REDUCTION+150, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+150, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+150, // $
-1, // $NT
  }
,
{ // state 294
106,150, // "r"
  }
,
{ // state 295
91,266, // "a"
  }
,
{ // state 296
-1, // $$start
-1, // start
314, // white*
-1, // $$0
MIN_REDUCTION+188, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+188, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+188, // $
-1, // $NT
  }
,
{ // state 297
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 298
97,320, // "n"
105,71, // "f"
  }
,
{ // state 299
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+161, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+161, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+161, // $
-1, // $NT
  }
,
{ // state 300
0x80000000|2, // match move
0x80000000|66, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 301
-1, // $$start
-1, // start
210, // white*
-1, // $$0
MIN_REDUCTION+140, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
-1, // `=
-1, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+140, // {255}
15, // "!"
MIN_REDUCTION+140, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+140, // $
-1, // $NT
  }
,
{ // state 302
-1, // $$start
-1, // start
264, // white*
-1, // $$0
MIN_REDUCTION+180, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+180, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+180, // $
-1, // $NT
  }
,
{ // state 303
99,214, // "t"
  }
,
{ // state 304
0x80000000|193, // match move
0x80000000|116, // no-match move
0x80000000|120, // NT-test-match state for digit
  }
,
{ // state 305
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 306
137,129, // digit
140,211, // {"0".."9"}
  }
,
{ // state 307
MIN_REDUCTION+250, // (default reduction)
  }
,
{ // state 308
90,149, // "l"
  }
,
{ // state 309
157,MIN_REDUCTION+193, // $NT
  }
,
{ // state 310
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+185, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+185, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+185, // $
-1, // $NT
  }
,
{ // state 311
117,184, // "/"
  }
,
{ // state 312
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 313
91,203, // "a"
  }
,
{ // state 314
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+187, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+187, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+187, // $
-1, // $NT
  }
,
{ // state 315
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 316
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+97, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+97, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+97, // $
-1, // $NT
  }
,
{ // state 317
-1, // $$start
-1, // start
48, // white*
-1, // $$0
MIN_REDUCTION+104, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+104, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+104, // "s"
-1, // idChar
MIN_REDUCTION+104, // "e"
MIN_REDUCTION+104, // "b"
-1, // "o"
MIN_REDUCTION+104, // "n"
-1, // "x"
MIN_REDUCTION+104, // "t"
-1, // "d"
MIN_REDUCTION+104, // "v"
MIN_REDUCTION+104, // "i"
MIN_REDUCTION+104, // "w"
-1, // "h"
MIN_REDUCTION+104, // "f"
MIN_REDUCTION+104, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+104, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+104, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+104, // $
-1, // $NT
  }
,
{ // state 318
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 319
106,275, // "r"
  }
,
{ // state 320
92,186, // "s"
99,136, // "t"
  }
,
{ // state 321
100,197, // "d"
  }
,
{ // state 322
102,10, // "i"
  }
,
{ // state 323
MIN_REDUCTION+242, // (default reduction)
  }
,
{ // state 324
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 326
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+177, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+177, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+177, // $
-1, // $NT
  }
,
{ // state 327
-1, // $$start
-1, // start
133, // white*
-1, // $$0
MIN_REDUCTION+182, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+182, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+182, // $
-1, // $NT
  }
,
{ // state 328
116,96, // "*"
  }
,
{ // state 329
-1, // $$start
-1, // start
190, // white*
-1, // $$0
MIN_REDUCTION+112, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+112, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+112, // "s"
-1, // idChar
MIN_REDUCTION+112, // "e"
MIN_REDUCTION+112, // "b"
-1, // "o"
MIN_REDUCTION+112, // "n"
-1, // "x"
MIN_REDUCTION+112, // "t"
-1, // "d"
MIN_REDUCTION+112, // "v"
MIN_REDUCTION+112, // "i"
MIN_REDUCTION+112, // "w"
-1, // "h"
MIN_REDUCTION+112, // "f"
MIN_REDUCTION+112, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+112, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+112, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+112, // $
-1, // $NT
  }
,
{ // state 330
MIN_REDUCTION+243, // (default reduction)
  }
,
{ // state 331
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 332
0x80000000|2, // match move
0x80000000|90, // no-match move
// T-test match for "*":
116,
  }
,
{ // state 333
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 334
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 335
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 336
108,261, // "u"
  }
,
{ // state 337
144,255, // eol
151,369, // {10}
152,270, // {13}
  }
,
{ // state 338
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 339
92,82, // "s"
  }
,
{ // state 340
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 341
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 342
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+147, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+147, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+147, // $
-1, // $NT
  }
,
{ // state 343
157,MIN_REDUCTION+204, // $NT
  }
,
{ // state 344
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 345
117,164, // "/"
  }
,
{ // state 346
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 347
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 348
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 349
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+93, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+93, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+93, // $
-1, // $NT
  }
,
{ // state 350
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 351
89,148, // "c"
90,148, // "l"
91,148, // "a"
92,148, // "s"
94,148, // "e"
95,148, // "b"
96,148, // "o"
97,148, // "n"
98,148, // "x"
99,148, // "t"
100,148, // "d"
101,148, // "v"
102,148, // "i"
103,148, // "w"
104,148, // "h"
105,148, // "f"
106,148, // "r"
107,148, // "k"
108,148, // "u"
109,148, // "p"
111,148, // "!"
112,148, // "="
113,148, // "+"
114,148, // "%"
115,148, // "&"
116,148, // "*"
117,148, // "/"
118,148, // "("
119,148, // ")"
120,148, // "{"
121,148, // "}"
122,148, // "-"
123,148, // "["
124,148, // "]"
125,148, // "|"
126,148, // "<"
127,148, // ","
128,148, // ">"
129,148, // ":"
130,148, // "."
131,148, // ";"
134,148, // "'"
135,51, // printable
138,148, // "_"
139,148, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
140,148, // {"0".."9"}
142,148, // " "
144,52, // eol
145,11, // printable*
147,284, // comment*
149,235, // comment
150,337, // comment_builder
151,369, // {10}
152,270, // {13}
153,148, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
  }
,
{ // state 352
0x80000000|122, // match move
0x80000000|46, // no-match move
// T-test match for "=":
112,
  }
,
{ // state 353
-1, // $$start
-1, // start
256, // white*
-1, // $$0
MIN_REDUCTION+92, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
MIN_REDUCTION+92, // "c"
-1, // "l"
-1, // "a"
MIN_REDUCTION+92, // "s"
-1, // idChar
MIN_REDUCTION+92, // "e"
MIN_REDUCTION+92, // "b"
-1, // "o"
MIN_REDUCTION+92, // "n"
-1, // "x"
MIN_REDUCTION+92, // "t"
-1, // "d"
MIN_REDUCTION+92, // "v"
MIN_REDUCTION+92, // "i"
MIN_REDUCTION+92, // "w"
-1, // "h"
MIN_REDUCTION+92, // "f"
MIN_REDUCTION+92, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+92, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
-1, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
-1, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
MIN_REDUCTION+92, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
-1, // digit+
MIN_REDUCTION+92, // $
-1, // $NT
  }
};
}
private class Initter4{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 354
104,161, // "h"
  }
,
{ // state 355
-1, // $$start
-1, // start
239, // white*
-1, // $$0
MIN_REDUCTION+170, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+170, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+170, // $
-1, // $NT
  }
,
{ // state 356
157,MIN_REDUCTION+195, // $NT
  }
,
{ // state 357
94,268, // "e"
  }
,
{ // state 358
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+135, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+135, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+135, // $
-1, // $NT
  }
,
{ // state 359
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 360
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 361
0x80000000|2, // match move
0x80000000|13, // no-match move
// T-test match for "/":
117,
  }
,
{ // state 362
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 363
-1, // $$start
-1, // start
72, // white*
-1, // $$0
MIN_REDUCTION+168, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+168, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
114, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+168, // $
-1, // $NT
  }
,
{ // state 364
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+123, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+123, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+123, // $
-1, // $NT
  }
,
{ // state 365
94,67, // "e"
  }
,
{ // state 366
106,78, // "r"
  }
,
{ // state 367
0x80000000|2, // match move
0x80000000|3, // no-match move
0x80000000|89, // NT-test-match state for idChar
  }
,
{ // state 368
151,344, // {10}
  }
,
{ // state 369
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 370
-1, // $$start
-1, // start
-1, // white*
-1, // $$0
MIN_REDUCTION+173, // token
242, // `boolean
168, // `class
126, // `extends
177, // `void
130, // `int
286, // `while
233, // `if
188, // `else
335, // `for
115, // `break
318, // `this
181, // `false
20, // `true
222, // `super
350, // `null
247, // `return
45, // `instanceof
198, // `new
334, // `abstract
70, // `assert
207, // `byte
28, // `case
22, // `catch
187, // `char
25, // `const
69, // `continue
273, // `default
283, // `do
245, // `double
260, // `enum
259, // `final
341, // `finally
123, // `float
234, // `goto
362, // `implements
191, // `import
58, // `interface
39, // `long
88, // `native
62, // `package
76, // `private
312, // `protected
32, // `public
359, // `short
340, // `static
347, // `strictfp
91, // `switch
146, // `synchronized
80, // `throw
217, // `throws
178, // `transient
8, // `try
132, // `volatile
154, // `!
271, // `!=
289, // `%
262, // `&&
240, // `*
63, // `(
333, // `)
172, // `{
166, // `}
33, // `-
143, // `+
285, // `=
34, // `==
297, // `[
331, // `]
281, // `||
215, // `<
360, // `<=
267, // `,
61, // `>
36, // `>=
65, // `.
249, // `;
199, // `++
238, // `--
97, // `/
42, // `:
100, // ID
24, // INT_LITERAL
228, // STRING_LITERAL
315, // CHARACTER_LITERAL
175, // "c"
-1, // "l"
-1, // "a"
336, // "s"
-1, // idChar
279, // "e"
138, // "b"
-1, // "o"
21, // "n"
-1, // "x"
113, // "t"
-1, // "d"
231, // "v"
298, // "i"
354, // "w"
-1, // "h"
27, // "f"
246, // "r"
-1, // "k"
-1, // "u"
-1, // "p"
MIN_REDUCTION+173, // {255}
15, // "!"
212, // "="
85, // "+"
84, // "%"
83, // "&"
361, // "*"
373, // "/"
160, // "("
293, // ")"
53, // "{"
227, // "}"
192, // "-"
263, // "["
29, // "]"
17, // "|"
352, // "<"
355, // ","
254, // ">"
272, // ":"
49, // "."
302, // ";"
296, // digit++
125, // sq
98, // "'"
-1, // printable
-1, // letter
304, // digit
-1, // "_"
-1, // {"A".."Z" "g" "j" "m" "q" "y".."z"}
211, // {"0".."9"}
145, // white
305, // " "
305, // {9 12}
346, // eol
-1, // printable*
147, // start_comment
-1, // comment*
-1, // end_comment
-1, // comment
-1, // comment_builder
274, // {10}
243, // {13}
-1, // {'"'.."$" "?".."@" "\" "^" "`" "~"}
-1, // token*
140, // digit+
MIN_REDUCTION+173, // $
-1, // $NT
  }
,
{ // state 371
112,26, // "="
  }
,
{ // state 372
91,218, // "a"
  }
,
{ // state 373
0x80000000|19, // match move
0x80000000|221, // no-match move
// T-test match for "*":
116,
  }
,
{ // state 374
MIN_REDUCTION+211, // (default reduction)
  }
,
};
}
public TokenGrammarParseTable(TokenGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[375][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
  doneSoFar += new Initter4().doInit(doneSoFar);
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
// `* ::= "*" !"/" white*
(62<<16)+2,
// `* ::= "*" !"/"
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
// `/ ::= "/" !"*" !"/" white*
(83<<16)+2,
// `/ ::= "/" !"*" !"/"
(83<<16)+1,
// INT_LITERAL ::= digit++ white*
(86<<16)+2,
// INT_LITERAL ::= digit++
(86<<16)+1,
// sq ::= "'"
(133<<16)+1,
// CHARACTER_LITERAL ::= sq printable sq
(88<<16)+3,
// ID ::= !255 {255}
(85<<16)+1,
// STRING_LITERAL ::= !255 {255}
(87<<16)+1,
// idChar ::= letter
(93<<16)+1,
// idChar ::= digit
(93<<16)+1,
// idChar ::= "_"
(93<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(136<<16)+1,
// digit ::= {"0".."9"}
(137<<16)+1,
// white ::= {9 12 " "}
(141<<16)+1,
// white ::= eol
(141<<16)+1,
// white ::= "/" "/" printable* eol
(141<<16)+4,
// white ::= "/" "/" eol
(141<<16)+3,
// white ::= start_comment comment* end_comment
(141<<16)+3,
// white ::= start_comment end_comment
(141<<16)+2,
// end_comment ::= "*" "/"
(148<<16)+2,
// start_comment ::= "/" "*"
(146<<16)+2,
// comment ::= comment_builder eol
(149<<16)+2,
// comment ::= !end_comment eol
(149<<16)+1,
// comment_builder ::= !end_comment printable*
(150<<16)+1,
// eol ::= {10}
(144<<16)+1,
// eol ::= {13} {10}
(144<<16)+2,
// eol ::= {13} !10
(144<<16)+1,
// printable ::= {" ".."~"}
(135<<16)+1,
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
// token* ::= token* token
(154<<16)+2,
// token* ::= token
(154<<16)+1,
// digit++ ::= digit+ !digit
(132<<16)+1,
// printable* ::= printable* printable
(145<<16)+2,
// printable* ::= printable
(145<<16)+1,
// white* ::= white* white
(2<<16)+2,
// white* ::= white
(2<<16)+1,
// comment* ::= comment* comment
(147<<16)+2,
// comment* ::= comment
(147<<16)+1,
// digit+ ::= digit
(155<<16)+1,
// digit+ ::= digit+ digit
(155<<16)+2,
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
143, // 9
151, // 10
-1, // 11
143, // 12
152, // 13
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
142, // " "
111, // "!"
153, // '"'
153, // "#"
153, // "$"
114, // "%"
115, // "&"
134, // "'"
118, // "("
119, // ")"
116, // "*"
113, // "+"
127, // ","
122, // "-"
130, // "."
117, // "/"
140, // "0"
140, // "1"
140, // "2"
140, // "3"
140, // "4"
140, // "5"
140, // "6"
140, // "7"
140, // "8"
140, // "9"
129, // ":"
131, // ";"
126, // "<"
112, // "="
128, // ">"
153, // "?"
153, // "@"
139, // "A"
139, // "B"
139, // "C"
139, // "D"
139, // "E"
139, // "F"
139, // "G"
139, // "H"
139, // "I"
139, // "J"
139, // "K"
139, // "L"
139, // "M"
139, // "N"
139, // "O"
139, // "P"
139, // "Q"
139, // "R"
139, // "S"
139, // "T"
139, // "U"
139, // "V"
139, // "W"
139, // "X"
139, // "Y"
139, // "Z"
123, // "["
153, // "\"
124, // "]"
153, // "^"
138, // "_"
153, // "`"
91, // "a"
95, // "b"
89, // "c"
100, // "d"
94, // "e"
105, // "f"
139, // "g"
104, // "h"
102, // "i"
139, // "j"
107, // "k"
90, // "l"
139, // "m"
97, // "n"
96, // "o"
109, // "p"
139, // "q"
106, // "r"
92, // "s"
99, // "t"
108, // "u"
101, // "v"
103, // "w"
98, // "x"
139, // "y"
139, // "z"
120, // "{"
125, // "|"
121, // "}"
153, // "~"
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
110, // 255
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
"", // 232
"", // 233
"", // 234
"", // 235
"", // 236
"", // 237
"", // 238
"", // 239
"token* ::= token* token", // 240
"token* ::= token* token", // 241
"digit++ ::= digit+ !digit", // 242
"printable* ::= printable* printable", // 243
"printable* ::= printable* printable", // 244
"white* ::= white* white", // 245
"white* ::= white* white", // 246
"comment* ::= comment* comment", // 247
"comment* ::= comment* comment", // 248
"digit+ ::= digit", // 249
"digit+ ::= digit+ digit", // 250
"", // 251
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= start @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: $$start ::= [start] @pass
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // 2: start ::= white* $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 3: start ::= white* [token*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 4: start ::= [white*] $$0 @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 5: token ::= [#] `boolean @sawBoolean(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 6: token ::= [#] `class @sawClass(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 7: token ::= [#] `extends @sawExtends(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 8: token ::= [#] `void @sawVoid(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: token ::= [#] `int @sawInt(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: token ::= [#] `while @sawWhile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: token ::= [#] `if @sawIf(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: token ::= [#] `else @sawElse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: token ::= [#] `for @sawFor(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 14: token ::= [#] `break @sawBreak(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 15: token ::= [#] `this @sawThis(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 16: token ::= [#] `false @sawFalse(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 17: token ::= [#] `true @sawTrue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 18: token ::= [#] `super @sawSuper(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 19: token ::= [#] `null @sawNull(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 20: token ::= [#] `return @sawReturn(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 21: token ::= [#] `instanceof @sawInstanceof(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 22: token ::= [#] `new @sawNew(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 23: token ::= [#] `abstract @sawAbstract(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 24: token ::= [#] `assert @sawAssert(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 25: token ::= [#] `byte @sawByte(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 26: token ::= [#] `case @sawCase(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 27: token ::= [#] `catch @sawCatch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 28: token ::= [#] `char @sawChar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 29: token ::= [#] `const @sawConst(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 30: token ::= [#] `continue @sawContinue(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 31: token ::= [#] `default @sawDefault(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 32: token ::= [#] `do @sawDo(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 33: token ::= [#] `double @sawDouble(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 34: token ::= [#] `enum @sawEnum(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 35: token ::= [#] `final @sawFinal(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 36: token ::= [#] `finally @sawFinally(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 37: token ::= [#] `float @sawFloat(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 38: token ::= [#] `goto @sawGoto(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 39: token ::= [#] `implements @sawImplements(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 40: token ::= [#] `import @sawImport(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 41: token ::= [#] `interface @sawInterface(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 42: token ::= [#] `long @sawLong(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 43: token ::= [#] `native @sawNative(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 44: token ::= [#] `package @sawPackage(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 45: token ::= [#] `private @sawPrivate(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 46: token ::= [#] `protected @sawProtected(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 47: token ::= [#] `public @sawPublic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 48: token ::= [#] `short @sawShort(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 49: token ::= [#] `static @sawStatic(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 50: token ::= [#] `strictfp @sawStrictfp(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 51: token ::= [#] `switch @sawSwitch(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 52: token ::= [#] `synchronized @sawSynchronized(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 53: token ::= [#] `throw @sawThrow(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 54: token ::= [#] `throws @sawThrows(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 55: token ::= [#] `transient @sawTransient(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 56: token ::= [#] `try @sawTry(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 57: token ::= [#] `volatile @sawVolatile(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 58: token ::= [#] `! @sawNot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 59: token ::= [#] `!= @sawNotEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 60: token ::= [#] `% @sawRemainder(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 61: token ::= [#] `&& @sawAnd(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 62: token ::= [#] `* @sawTimes(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 63: token ::= [#] `( @sawLpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 64: token ::= [#] `) @sawRpar(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 65: token ::= [#] `{ @sawLbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 66: token ::= [#] `} @sawRbrace(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 67: token ::= [#] `- @sawMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 68: token ::= [#] `+ @sawPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 69: token ::= [#] `= @sawAssign(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
    { // 70: token ::= [#] `== @sawEqual(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((65<<5)|0x5)/*methodCall:65*/,
    },
    { // 71: token ::= [#] `[ @sawLbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((66<<5)|0x5)/*methodCall:66*/,
    },
    { // 72: token ::= [#] `] @sawRbrack(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((67<<5)|0x5)/*methodCall:67*/,
    },
    { // 73: token ::= [#] `|| @sawOr(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((68<<5)|0x5)/*methodCall:68*/,
    },
    { // 74: token ::= [#] `< @sawLess(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((69<<5)|0x5)/*methodCall:69*/,
    },
    { // 75: token ::= [#] `<= @sawLessEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((70<<5)|0x5)/*methodCall:70*/,
    },
    { // 76: token ::= [#] `, @sawComma(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((71<<5)|0x5)/*methodCall:71*/,
    },
    { // 77: token ::= [#] `> @sawGreater(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((72<<5)|0x5)/*methodCall:72*/,
    },
    { // 78: token ::= [#] `>= @sawGreaterEq(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((73<<5)|0x5)/*methodCall:73*/,
    },
    { // 79: token ::= [#] `. @sawDot(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((74<<5)|0x5)/*methodCall:74*/,
    },
    { // 80: token ::= [#] `; @sawSemi(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((75<<5)|0x5)/*methodCall:75*/,
    },
    { // 81: token ::= [#] `++ @sawPlusPlus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((76<<5)|0x5)/*methodCall:76*/,
    },
    { // 82: token ::= [#] `-- @sawMinusMinus(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((77<<5)|0x5)/*methodCall:77*/,
    },
    { // 83: token ::= [#] `/ @sawSlash(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((78<<5)|0x5)/*methodCall:78*/,
    },
    { // 84: token ::= [#] `: @sawColon(int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((79<<5)|0x5)/*methodCall:79*/,
    },
    { // 85: token ::= [#] ID @identifier(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((80<<5)|0x5)/*methodCall:80*/,
    },
    { // 86: token ::= [#] INT_LITERAL @intLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((81<<5)|0x5)/*methodCall:81*/,
    },
    { // 87: token ::= [#] STRING_LITERAL @stringLit(int,String)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((82<<5)|0x5)/*methodCall:82*/,
    },
    { // 88: token ::= [#] CHARACTER_LITERAL @charLit(int,int)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 125: `abstract ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 126: `assert ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `byte ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `case ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `catch ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `char ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 131: `const ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `continue ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `!= ::= "!" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 134: `!= ::= "!" "=" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 135: `+ ::= "+" !"+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `+ ::= "+" !"+" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `! ::= "!" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `! ::= "!" !"=" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `= ::= "=" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `= ::= "=" !"=" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `% ::= "%" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `% ::= "%" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `&& ::= "&" "&" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 144: `&& ::= "&" "&" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 145: `* ::= "*" !"/" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `* ::= "*" !"/" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `( ::= "(" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `( ::= "(" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `) ::= ")" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `) ::= ")" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `{ ::= "{" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `{ ::= "{" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `} ::= "}" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `} ::= "}" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `- ::= "-" !"-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 156: `- ::= "-" !"-" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 157: `== ::= "=" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 158: `== ::= "=" "=" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 159: `[ ::= "[" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `[ ::= "[" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `] ::= "]" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 162: `] ::= "]" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 163: `|| ::= "|" "|" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 164: `|| ::= "|" "|" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 165: `< ::= "<" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 166: `< ::= "<" !"=" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 167: `<= ::= "<" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 168: `<= ::= "<" "=" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 169: `, ::= "," white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `, ::= "," [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `> ::= ">" !"=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 172: `> ::= ">" !"=" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 173: `>= ::= ">" "=" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 174: `>= ::= ">" "=" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 175: `: ::= ":" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `: ::= ":" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 177: `. ::= "." white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `. ::= "." [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: `; ::= ";" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 180: `; ::= ";" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 181: `++ ::= "+" "+" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 182: `++ ::= "+" "+" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 183: `-- ::= "-" "-" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 184: `-- ::= "-" "-" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 185: `/ ::= "/" !"*" !"/" white* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 186: `/ ::= "/" !"*" !"/" [white*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 187: INT_LITERAL ::= [#] digit++ white* @convertToInt(int,List<Character>)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 188: INT_LITERAL ::= [#] digit++ [white*] @convertToInt(int,List<Character>)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((84<<5)|0x5)/*methodCall:84*/,
    },
    { // 189: sq ::= "'" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 190: CHARACTER_LITERAL ::= sq printable sq @makeChar(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((85<<5)|0x5)/*methodCall:85*/,
    },
    { // 191: ID ::= !255 {255} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 192: STRING_LITERAL ::= !255 {255} @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 193: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 194: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 195: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 196: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 197: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 198: white ::= {9 12 " "} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 199: white ::= eol @void
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 200: white ::= "/" "/" printable* eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 201: white ::= "/" "/" [printable*] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 202: white ::= start_comment comment* end_comment @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 203: white ::= start_comment [comment*] end_comment @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 204: end_comment ::= "*" "/" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 205: start_comment ::= "/" "*" @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 206: comment ::= comment_builder eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 207: comment ::= !end_comment [comment_builder] eol @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 208: comment_builder ::= !end_comment printable* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 209: eol ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 210: eol ::= {13} {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 211: eol ::= {13} !10 [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 212: printable ::= {" ".."~"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 213: `default ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 214: `do ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 215: `double ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 216: `enum ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 217: `final ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 218: `finally ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 219: `float ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 220: `goto ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 221: `implements ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 222: `import ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 223: `interface ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 224: `long ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 225: `native ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 226: `package ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 227: `private ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 228: `protected ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 229: `public ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 230: `short ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 231: `static ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 232: `strictfp ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 233: `switch ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 234: `synchronized ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 235: `throw ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 236: `throws ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 237: `transient ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 238: `try ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 239: `volatile ::= !255 {255} @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 240: token* ::= token* token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 241: token* ::= [token*] token @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 242: digit++ ::= digit+ !digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 243: printable* ::= printable* printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 244: printable* ::= [printable*] printable @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 245: white* ::= white* white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 246: white* ::= [white*] white @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 247: comment* ::= comment* comment @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 248: comment* ::= [comment*] comment @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
    },
    { // 249: digit+ ::= digit @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 250: digit+ ::= digit+ digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 251: $$0 ::= token* @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "comment* ::=", // comment*
    "printable* ::=", // printable*
    "", // start
    "token* ::=", // token*
    "white* ::=", // white*
    "", // comment_builder
    "", // $$start
    "# ::=", // #
    "", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // comment*
    },
    { // printable*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // start
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // token*
    },
    { // white*
    },
    { // comment_builder
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // $$start
      ((2<<5)|0x6)/*nullProductionAction:2*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((86<<5)|0x5)/*methodCall:86*/,
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
    1,
    0,
    0,
    0,
    0,
    0,
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
