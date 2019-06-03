/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.prgmdl.dstmverifier.transition.trigger.node;

import org.prgmdl.dstmverifier.transition.trigger.analysis.*;

@SuppressWarnings("nls")
public final class AChnBasic extends PBasic
{
    private TChn _chn_;

    public AChnBasic()
    {
        // Constructor
    }

    public AChnBasic(
        @SuppressWarnings("hiding") TChn _chn_)
    {
        // Constructor
        setChn(_chn_);

    }

    @Override
    public Object clone()
    {
        return new AChnBasic(
            cloneNode(this._chn_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAChnBasic(this);
    }

    public TChn getChn()
    {
        return this._chn_;
    }

    public void setChn(TChn node)
    {
        if(this._chn_ != null)
        {
            this._chn_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chn_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._chn_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._chn_ == child)
        {
            this._chn_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._chn_ == oldChild)
        {
            setChn((TChn) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}