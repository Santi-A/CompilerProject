// Generated from C:/Users/Santi/Desktop/COMPILE/CMPILERScanner\g.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(gParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(gParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(gParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#singledeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingledeclaration(gParser.SingledeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#arraydeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraydeclaration(gParser.ArraydeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#booleandeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleandeclaration(gParser.BooleandeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#intdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntdeclaration(gParser.IntdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#intarrdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntarrdeclaration(gParser.IntarrdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#floatdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatdeclaration(gParser.FloatdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#floatarrdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatarrdeclaration(gParser.FloatarrdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#chardeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardeclaration(gParser.ChardeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#chararrdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChararrdeclaration(gParser.ChararrdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(gParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(gParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(gParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(gParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpr(gParser.OprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#addopr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddopr(gParser.AddoprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#multopr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultopr(gParser.MultoprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#terminalopr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalopr(gParser.TerminaloprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#shortopr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortopr(gParser.ShortoprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(gParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(gParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(gParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#booleanexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanexp(gParser.BooleanexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#booleanvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanvalue(gParser.BooleanvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(gParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(gParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#vararrname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVararrname(gParser.VararrnameContext ctx);
}