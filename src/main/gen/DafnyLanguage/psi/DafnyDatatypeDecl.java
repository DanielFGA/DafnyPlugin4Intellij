// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyDatatypeDecl extends PsiElement {

  @NotNull
  List<DafnyAttribute> getAttributeList();

  @NotNull
  List<DafnyDatatypeMemberDecl> getDatatypeMemberDeclList();

  @Nullable
  DafnyGenericParameters getGenericParameters();

  @NotNull
  DafnyNoUSIdent getNoUSIdent();

  @NotNull
  PsiElement getAssign();

  @Nullable
  PsiElement getCodatatype();

  @Nullable
  PsiElement getDatatype();

  @Nullable
  PsiElement getSemi();

}