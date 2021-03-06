/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.data.node;

import org.prgmdl.dstmverifier.data.analysis.*;

@SuppressWarnings("nls")
public final class AMultitypeDeclaration extends PDeclaration
{
    private PMultitypeDeclaration _multitypeDeclaration_;
    private TSemi _semi_;

    public AMultitypeDeclaration()
    {
        // Constructor
    }

    public AMultitypeDeclaration(
        @SuppressWarnings("hiding") PMultitypeDeclaration _multitypeDeclaration_,
        @SuppressWarnings("hiding") TSemi _semi_)
    {
        // Constructor
        setMultitypeDeclaration(_multitypeDeclaration_);

        setSemi(_semi_);

    }

    @Override
    public Object clone()
    {
        return new AMultitypeDeclaration(
            cloneNode(this._multitypeDeclaration_),
            cloneNode(this._semi_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultitypeDeclaration(this);
    }

    public PMultitypeDeclaration getMultitypeDeclaration()
    {
        return this._multitypeDeclaration_;
    }

    public void setMultitypeDeclaration(PMultitypeDeclaration node)
    {
        if(this._multitypeDeclaration_ != null)
        {
            this._multitypeDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multitypeDeclaration_ = node;
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
            + toString(this._multitypeDeclaration_)
            + toString(this._semi_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._multitypeDeclaration_ == child)
        {
            this._multitypeDeclaration_ = null;
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
        if(this._multitypeDeclaration_ == oldChild)
        {
            setMultitypeDeclaration((PMultitypeDeclaration) newChild);
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
