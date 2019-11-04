//
//  blur_vs.glsl
//  GLChart
//
//  Created by Pavel Kosov on 03/05/2017.
//  Copyright © 2017 IQOPTION. All rights reserved.
//

uniform mat4 u_TransMatrix;

attribute vec4 a_Position;
attribute vec2 a_TexCoord;

varying vec2 v_TexCoord;

void main()
{
    v_TexCoord = a_TexCoord;
    gl_Position = u_TransMatrix * a_Position;
}
