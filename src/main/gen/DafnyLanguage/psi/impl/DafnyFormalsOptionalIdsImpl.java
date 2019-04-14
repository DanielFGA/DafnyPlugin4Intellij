// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static DafnyLanguage.psi.impl.DafnyTypeImpl.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import DafnyLanguage.psi.*;

public class DafnyFormalsOptionalIdsImpl extends ASTWrapperPsiElement implements DafnyFormalsOptionalIds {

  public DafnyFormalsOptionalIdsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull DafnyVisitor visitor) {
    visitor.visitFormalsOptionalIds(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DafnyVisitor) accept((DafnyVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DafnyTypeIdentOptional> getTypeIdentOptionalList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DafnyTypeIdentOptional.class);
  }

  @Override
  @NotNull
  public PsiElement getCloseparen() {
    return findNotNullChildByType(CLOSEPAREN);
  }

  @Override
  @NotNull
  public PsiElement getOpenparen() {
    return findNotNullChildByType(OPENPAREN);
  }

}
