// Generated from D:/GitHub/CompilerProject/CMPILERParser\g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(gParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(gParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(gParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(gParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(gParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(gParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(gParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(gParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnstatement(gParser.ReturnstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#returnstatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnstatement(gParser.ReturnstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#globaldelcaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobaldelcaration(gParser.GlobaldelcarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#globaldelcaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobaldelcaration(gParser.GlobaldelcarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#singledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingledeclaration(gParser.SingledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#singledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingledeclaration(gParser.SingledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#arraydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArraydeclaration(gParser.ArraydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#arraydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArraydeclaration(gParser.ArraydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#booleandeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBooleandeclaration(gParser.BooleandeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#booleandeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBooleandeclaration(gParser.BooleandeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#intdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntdeclaration(gParser.IntdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#intdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntdeclaration(gParser.IntdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#intarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIntarrdeclaration(gParser.IntarrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#intarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIntarrdeclaration(gParser.IntarrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#floatdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatdeclaration(gParser.FloatdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#floatdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatdeclaration(gParser.FloatdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#floatarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFloatarrdeclaration(gParser.FloatarrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#floatarrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFloatarrdeclaration(gParser.FloatarrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#chardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterChardeclaration(gParser.ChardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#chardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitChardeclaration(gParser.ChardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#chararrdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterChararrdeclaration(gParser.ChararrdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#chararrdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitChararrdeclaration(gParser.ChararrdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forcedintdec}.
	 * @param ctx the parse tree
	 */
	void enterForcedintdec(gParser.ForcedintdecContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forcedintdec}.
	 * @param ctx the parse tree
	 */
	void exitForcedintdec(gParser.ForcedintdecContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(gParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(gParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(gParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(gParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(gParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(gParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elseifstatement}.
	 * @param ctx the parse tree
	 */
	void enterElseifstatement(gParser.ElseifstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elseifstatement}.
	 * @param ctx the parse tree
	 */
	void exitElseifstatement(gParser.ElseifstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void enterElsestatement(gParser.ElsestatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#elsestatement}.
	 * @param ctx the parse tree
	 */
	void exitElsestatement(gParser.ElsestatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(gParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(gParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#loopfor}.
	 * @param ctx the parse tree
	 */
	void enterLoopfor(gParser.LoopforContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#loopfor}.
	 * @param ctx the parse tree
	 */
	void exitLoopfor(gParser.LoopforContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#loopwhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopwhile(gParser.LoopwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#loopwhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopwhile(gParser.LoopwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#loopdowhile}.
	 * @param ctx the parse tree
	 */
	void enterLoopdowhile(gParser.LoopdowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#loopdowhile}.
	 * @param ctx the parse tree
	 */
	void exitLoopdowhile(gParser.LoopdowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(gParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(gParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#opr}.
	 * @param ctx the parse tree
	 */
	void enterOpr(gParser.OprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#opr}.
	 * @param ctx the parse tree
	 */
	void exitOpr(gParser.OprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#addopr}.
	 * @param ctx the parse tree
	 */
	void enterAddopr(gParser.AddoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#addopr}.
	 * @param ctx the parse tree
	 */
	void exitAddopr(gParser.AddoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#multopr}.
	 * @param ctx the parse tree
	 */
	void enterMultopr(gParser.MultoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#multopr}.
	 * @param ctx the parse tree
	 */
	void exitMultopr(gParser.MultoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#terminalopr}.
	 * @param ctx the parse tree
	 */
	void enterTerminalopr(gParser.TerminaloprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#terminalopr}.
	 * @param ctx the parse tree
	 */
	void exitTerminalopr(gParser.TerminaloprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#shortopr}.
	 * @param ctx the parse tree
	 */
	void enterShortopr(gParser.ShortoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#shortopr}.
	 * @param ctx the parse tree
	 */
	void exitShortopr(gParser.ShortoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(gParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(gParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#printblock}.
	 * @param ctx the parse tree
	 */
	void enterPrintblock(gParser.PrintblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#printblock}.
	 * @param ctx the parse tree
	 */
	void exitPrintblock(gParser.PrintblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#stringcontent}.
	 * @param ctx the parse tree
	 */
	void enterStringcontent(gParser.StringcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#stringcontent}.
	 * @param ctx the parse tree
	 */
	void exitStringcontent(gParser.StringcontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(gParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(gParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#nestedcondition}.
	 * @param ctx the parse tree
	 */
	void enterNestedcondition(gParser.NestedconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#nestedcondition}.
	 * @param ctx the parse tree
	 */
	void exitNestedcondition(gParser.NestedconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanexp(gParser.BooleanexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#booleanexp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanexp(gParser.BooleanexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(gParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(gParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(gParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(gParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanvalue(gParser.BooleanvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#booleanvalue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanvalue(gParser.BooleanvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#vararrname}.
	 * @param ctx the parse tree
	 */
	void enterVararrname(gParser.VararrnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#vararrname}.
	 * @param ctx the parse tree
	 */
	void exitVararrname(gParser.VararrnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(gParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(gParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#charliteral}.
	 * @param ctx the parse tree
	 */
	void enterCharliteral(gParser.CharliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#charliteral}.
	 * @param ctx the parse tree
	 */
	void exitCharliteral(gParser.CharliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void enterStringliteral(gParser.StringliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void exitStringliteral(gParser.StringliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#intliteral}.
	 * @param ctx the parse tree
	 */
	void enterIntliteral(gParser.IntliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#intliteral}.
	 * @param ctx the parse tree
	 */
	void exitIntliteral(gParser.IntliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#floatliteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatliteral(gParser.FloatliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#floatliteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatliteral(gParser.FloatliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(gParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(gParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gParser.StatementContext ctx);
}