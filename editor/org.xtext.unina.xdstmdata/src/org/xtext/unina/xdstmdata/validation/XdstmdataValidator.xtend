/*
 * generated by Xtext 2.13.0
 */
package org.xtext.unina.xdstmdata.validation

import org.eclipse.xtext.validation.Check
import org.xtext.unina.xdstmdata.xDstmdata.channel_specifier
import org.xtext.unina.xdstmdata.xDstmdata.tTypes
import org.xtext.unina.xdstmdata.xDstmdata.XDstmdataPackage
import org.xtext.unina.xdstmdata.xDstmdata.tEnum
import org.xtext.unina.xdstmdata.xDstmdata.cExtchannel
import org.xtext.unina.xdstmdata.xDstmdata.cIntchannel
import org.xtext.unina.xdstmdata.xDstmdata.vVariable
import org.xtext.unina.xdstmdata.xDstmdata.tCompound
import org.xtext.unina.xdstmdata.xDstmdata.tMultitype

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class XdstmdataValidator extends AbstractXdstmdataValidator {
		
	@Check(FAST)
	//check for the existence of IDs in expressions of the form Chn[ID]
	def checkChannelInternalType(channel_specifier cs) {
		var idType = cs.type;
		var model = cs.eContainer.eContainer as tTypes;
		
		if (idType !== null && !Helper.isEnum(model, idType) && !Helper.isCompound(model, idType) && !Helper.isMultitype(model, idType))
			error("Type name is not recognized", XDstmdataPackage.Literals.CHANNEL_SPECIFIER__TYPE);
	}
	
	@Check(FAST)
	//check for duplicated names and duplicated literals in tEnum
	def checkEnumNameAndLiterals(tEnum t) {
		var model = t.eContainer as tTypes;
		for (t1 : model.TEnum) {
			if (!t.equals(t1) && t.name.compareToIgnoreCase(t1.name)==0) {
					error("Types cannot have the same name", XDstmdataPackage.Literals.TENUM__NAME);
				}
		}
		for (t1 : model.TCompound) {
			if (t.name.compareToIgnoreCase(t1.name)==0) {
					error("Types cannot have the same name", XDstmdataPackage.Literals.TENUM__NAME);
				}
		}
		for (t1 : model.TMultitype) {
			if (t.name.compareToIgnoreCase(t1.name)==0) {
					error("Types cannot have the same name", XDstmdataPackage.Literals.TENUM__NAME);
				}
		}
		
		for (var i = 0; i < t.literals.size; i++) {
			var name = t.literals.get(i);
			for (var j = i+1; j < t.literals.size; j++) {
				if (t.literals.get(j).compareToIgnoreCase(name)==0) {
					error("Literal \"" + name + "\" is duplicated", XDstmdataPackage.Literals.TENUM__NAME);
				}
			}
		}
	}
	
	@Check(FAST)
	//check for duplicated names and type validity in tCompound
	def checkCompoundNameAndSubtype(tCompound t) {
		var model = t.eContainer as tTypes;
		for (t1 : model.TEnum) {
			if (t.name.compareToIgnoreCase(t1.name)==0) {
					error("Types cannot have the same name", XDstmdataPackage.Literals.TCOMPOUND__NAME);
				}
		}
		for (t1 : model.TCompound) {
			if (!t.equals(t1) && t.name.compareToIgnoreCase(t1.name)==0) {
					error("Types cannot have the same name", XDstmdataPackage.Literals.TCOMPOUND__NAME);
				}
		}
		for (t1 : model.TMultitype) {
			if (t.name.compareToIgnoreCase(t1.name)==0) {
					error("Types cannot have the same name", XDstmdataPackage.Literals.TCOMPOUND__NAME);
				}
		}
		
		for (sub : t.subtypes) {
			var idType = sub.TID
			if (idType !== null && !Helper.isEnum(model, idType))
				error("Type name is not recognized", sub, XDstmdataPackage.Literals.SUBTYPE__TID);
		}
		
	}
	
	@Check(FAST)
	//check for duplicated names and type validity in tCompound
	def checkMultitypeNameAndSubtype(tMultitype t) {
		var model = t.eContainer as tTypes;
		for (t1 : model.TEnum) {
			if (t.name.compareToIgnoreCase(t1.name)==0) {
					error("Types cannot have the same name", XDstmdataPackage.Literals.TMULTITYPE__NAME);
				}
		}
		for (t1 : model.TCompound) {
			if (t.name.compareToIgnoreCase(t1.name)==0) {
					error("Types cannot have the same name", XDstmdataPackage.Literals.TMULTITYPE__NAME);
				}
		}
		for (t1 : model.TMultitype) {
			if (!t.equals(t1) && t.name.compareToIgnoreCase(t1.name)==0) {
					error("Types cannot have the same name", XDstmdataPackage.Literals.TMULTITYPE__NAME);
				}
		}
		
		for (sub : t.composingtypes) {
			var idType = sub.TID
			if (idType !== null && !Helper.isEnum(model, idType) && !Helper.isCompound(model, idType))
				error("Type name is not recognized", sub, XDstmdataPackage.Literals.COMPOSINGTYPE__TID);
		}
		
	}
	
	@Check(FAST)
	//check for duplicated names (for external channels) and type validity
	def controlExtChannelName(cExtchannel c) {
		var model = c.eContainer as tTypes;
		for (c1 : model.CExtchannel) {
			if (!c.equals(c1) && c.name.compareToIgnoreCase(c1.name)==0) {
					error("Channels cannot have the same name", XDstmdataPackage.Literals.CEXTCHANNEL__NAME);
				}
		}
		for (c1 : model.CIntchannel) {
			if (c.name.compareToIgnoreCase(c1.name)==0) {
					error("Channels cannot have the same name", XDstmdataPackage.Literals.CEXTCHANNEL__NAME);
				}
		}
		
		var idType = c.TID;
		if (idType !== null && !Helper.isEnum(model, idType) && !Helper.isCompound(model, idType) && !Helper.isMultitype(model, idType))
			error("Type name is not recognized", XDstmdataPackage.Literals.CEXTCHANNEL__TID);
	}
	
	@Check(FAST)
	//check for duplicated names (for internal channels) and type validity
	def controlIntChannelNameAndType(cIntchannel c) {
		var model = c.eContainer as tTypes;
		for (c1 : model.CExtchannel) {
			if (c.name.compareToIgnoreCase(c1.name)==0) {
					error("Channels cannot have the same name", XDstmdataPackage.Literals.CINTCHANNEL__NAME);
				}
		}
		for (c1 : model.CIntchannel) {
			if (!c.equals(c1) && c.name.compareToIgnoreCase(c1.name)==0) {
					error("Channels cannot have the same name", XDstmdataPackage.Literals.CINTCHANNEL__NAME);
				}
		}
		
		var idType = c.TID;
		if (idType !== null && !Helper.isEnum(model, idType) && !Helper.isCompound(model, idType) && !Helper.isMultitype(model, idType))
			error("Type name is not recognized", XDstmdataPackage.Literals.CINTCHANNEL__TID);
	}
	
	@Check(FAST)
	//check for duplicated variable names and type validity
	def controlVarNameAndtype(vVariable v) {
		var model = v.eContainer as tTypes;
		for (v1 : model.VVariable) {
			if (!v.equals(v1) && v.name.compareToIgnoreCase(v1.name)==0) {
					error("Variables cannot have the same name", XDstmdataPackage.Literals.VVARIABLE__NAME);
				}
		}
		
		var idType = v.TID;
		if (idType !== null && !Helper.isEnum(model, idType) && !Helper.isCompound(model, idType))
			error("Type name is not recognized", XDstmdataPackage.Literals.VVARIABLE__TID);
	}
	
}
