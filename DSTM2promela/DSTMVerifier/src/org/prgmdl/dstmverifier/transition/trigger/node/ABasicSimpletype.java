/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.trigger.node;

import org.prgmdl.dstmverifier.transition.trigger.analysis.*;

@SuppressWarnings("nls")
public final class ABasicSimpletype extends PSimpletype
{
    private PBasic _basic_;

    public ABasicSimpletype()
    {
        // Constructor
    }

    public ABasicSimpletype(
        @SuppressWarnings("hiding") PBasic _basic_)
    {
        // Constructor
        setBasic(_basic_);

    }

    @Override
    public Object clone()
    {
        return new ABasicSimpletype(
            cloneNode(this._basic_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABasicSimpletype(this);
    }

    public PBasic getBasic()
    {
        return this._basic_;
    }

    public void setBasic(PBasic node)
    {
        if(this._basic_ != null)
        {
            this._basic_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._basic_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._basic_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._basic_ == child)
        {
            this._basic_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._basic_ == oldChild)
        {
            setBasic((PBasic) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
