// This is a generated file. Not intended for manual editing.
package DafnyLanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DafnyEquivExpression extends PsiElement {

  @NotNull
  List<DafnyEquivOp> getEquivOpList();

  @NotNull
  List<DafnyImpliesExpliesExpression> getImpliesExpliesExpressionList();

}