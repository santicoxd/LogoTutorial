// Generated from logo.g4 by ANTLR 4.7
package classes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link logoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface logoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link logoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(logoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(logoParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(logoParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#procedureInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureInvocation(logoParser.ProcedureInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureDeclaration(logoParser.ProcedureDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#parameterDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclarations(logoParser.ParameterDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(logoParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(logoParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(logoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#ife}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfe(logoParser.IfeContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(logoParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(logoParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#make}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMake(logoParser.MakeContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(logoParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#quotedstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedstring(logoParser.QuotedstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(logoParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(logoParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#signExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignExpression(logoParser.SignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyingExpression(logoParser.MultiplyingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(logoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#deref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeref(logoParser.DerefContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#fd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFd(logoParser.FdContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#bk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBk(logoParser.BkContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#rt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRt(logoParser.RtContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#lt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLt(logoParser.LtContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#cs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCs(logoParser.CsContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#pu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPu(logoParser.PuContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#pd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPd(logoParser.PdContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#ht}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHt(logoParser.HtContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSt(logoParser.StContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#home}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome(logoParser.HomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#stop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop(logoParser.StopContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(logoParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#setxy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetxy(logoParser.SetxyContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#random}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRandom(logoParser.RandomContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#fore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFore(logoParser.ForeContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(logoParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link logoParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(logoParser.CommentContext ctx);
}