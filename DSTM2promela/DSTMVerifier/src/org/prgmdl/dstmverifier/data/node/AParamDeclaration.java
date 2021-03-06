/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.data.node;

import org.prgmdl.dstmverifier.data.analysis.*;

@SuppressWarnings("nls")
public final class AParamDeclaration extends PDeclaration
{
    private PParamDeclaration _paramDeclaration_;
    private TSemi _semi_;

    public AParamDeclaration()
    {
        // Constructor
    }

    public AParamDeclaration(
        @SuppressWarnings("hiding") PParamDeclaration _paramDeclaration_,
        @SuppressWarnings("hiding") TSemi _semi_)
    {
        // Constructor
        setParamDeclaration(_paramDeclaration_);

        setSemi(_semi_);

    }

    @Override
    public Object clone()
    {
        return new AParamDeclaration(
            cloneNode(this._paramDeclaration_),
            cloneNode(this._semi_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParamDeclaration(this);
    }

    public PParamDeclaration getParamDeclaration()
    {
        return this._paramDeclaration_;
    }

    public void setParamDeclaration(PParamDeclaration node)
    {
        if(this._paramDeclaration_ != null)
        {
            this._paramDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._paramDeclaration_ = node;
    }

    public TSemi getSemi()
    {
        return this._semi_;
    }

    public void setSemi(TSemi node)
    {
        if(this._semi_ != null)
        {
            this._semi_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semi_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._paramDeclaration_)
            + toString(this._semi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._paramDeclaration_ == child)
        {
            this._paramDeclaration_ = null;
            return;
        }

        if(this._semi_ == child)
        {
            this._semi_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._paramDeclaration_ == oldChild)
        {
            setParamDeclaration((PParamDeclaration) newChild);
            return;
        }

        if(this._semi_ == oldChild)
        {
            setSemi((TSemi) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
