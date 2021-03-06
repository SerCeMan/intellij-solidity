package me.serce.solidity.lang.psi

import com.intellij.psi.NavigatablePsiElement
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import com.intellij.psi.PsiReference
import me.serce.solidity.lang.resolve.SolidityReference

interface SolidityElement : PsiElement {
  override fun getReference(): PsiReference?
}


interface SolidityNamedElement : SolidityElement, PsiNamedElement, NavigatablePsiElement
