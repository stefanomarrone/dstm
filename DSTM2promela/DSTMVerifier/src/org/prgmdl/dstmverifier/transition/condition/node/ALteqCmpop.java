/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.condition.node;

import org.prgmdl.dstmverifier.transition.condition.analysis.*;

@SuppressWarnings("nls")
public final class ALteqCmpop extends PCmpop
{
    private TLteq _lteq_;

    public ALteqCmpop()
    {
        // Constructor
    }

    public ALteqCmpop(
        @SuppressWarnings("hiding") TLteq _lteq_)
    {
        // Constructor
        setLteq(_lteq_);

    }

    @Override
    public Object clone()
    {
        return new ALteqCmpop(
            cloneNode(this._lteq_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALteqCmpop(this);
    }

    public TLteq getLteq()
    {
        return this._lteq_;
    }

    public void setLteq(TLteq node)
    {
        if(this._lteq_ != null)
        {
            this._lteq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lteq_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lteq_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lteq_ == child)
        {
            this._lteq_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lteq_ == oldChild)
        {
            setLteq((TLteq) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
