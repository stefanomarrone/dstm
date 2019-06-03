/*
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstmdata.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class XdstmdataProposalProvider extends AbstractXdstmdataProposalProvider {
	
	String mType = new String("Mtype /*Insert Name*/ { 
	// TODO - Insert list of compound and basic types
};");

	String compound = new String("Struct /*Insert Name*/ {
	// TODO - Insert list of basic types
};")
	
	String enumeration = new String("Enum /*Insert Name*/ {	/* TODO - Insert list of literals */}")
	
	
	// Proposal provider tCompound
	override complete_tCompound(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
    {
        acceptor.accept(createCompletionProposal(compound,context))
        super.complete_tCompound(model, ruleCall, context, acceptor)
    }
	
	// Proposal provider tMultiType
	override complete_tMultitype(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
    {
        acceptor.accept(createCompletionProposal(mType,context))
        super.complete_tMultitype(model, ruleCall, context, acceptor)
    }
    
    // Proposal provider enumeration
    override complete_tEnum(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
    {
        acceptor.accept(createCompletionProposal(enumeration,context))
        super.complete_tEnum(model, ruleCall, context, acceptor)
    }
	
}